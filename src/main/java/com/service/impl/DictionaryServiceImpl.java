package com.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.DictionaryDao;
import com.entity.DictionaryEntity;
import com.service.DictionaryService;
import com.entity.view.DictionaryView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * 字典表 服务实现类
 * @author 
 * @since 2021-02-25
 */
@Service("dictionaryService")
@Transactional
public class DictionaryServiceImpl extends ServiceImpl<DictionaryDao, DictionaryEntity> implements DictionaryService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<DictionaryView> page =new Query<DictionaryView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

    /**
     * 初始化字典表
     * @param servletContext
     */
    @Override
    public void init(ServletContext servletContext) {
        List<DictionaryEntity> dictionaryEntities = this.selectList(new EntityWrapper<DictionaryEntity>());
        Map<String, Map<Integer,String>> map = new HashMap<>();
        for(DictionaryEntity d :dictionaryEntities){
            Map<Integer, String> m = map.get(d.getDicCode());
            if(m ==null || m.isEmpty()){
                m = new HashMap<>();
            }
            m.put(d.getCodeIndex(),d.getIndexName());
            map.put(d.getDicCode(),m);
        }
        servletContext.setAttribute("dictionaryMap", map);
    }


}
