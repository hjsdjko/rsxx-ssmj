package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DictionaryEntity;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 字典表 服务类
 * @author 
 * @since 2021-02-25
 */
public interface DictionaryService extends IService<DictionaryEntity> {

     PageUtils queryPage(Map<String, Object> params);

     void init(ServletContext servletContext);

}