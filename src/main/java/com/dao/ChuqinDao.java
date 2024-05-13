package com.dao;

import com.entity.ChuqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuqinView;

/**
 * 考勤 Dao 接口
 *
 * @author 
 * @since 2021-02-25
 */
public interface ChuqinDao extends BaseMapper<ChuqinEntity> {

   List<ChuqinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
