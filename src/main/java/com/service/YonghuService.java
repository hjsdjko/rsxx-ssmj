package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuEntity;
import java.util.Map;

/**
 * 用户 服务类
 * @author 
 * @since 2021-02-25
 */
public interface YonghuService extends IService<YonghuEntity> {

     PageUtils queryPage(Map<String, Object> params);

}