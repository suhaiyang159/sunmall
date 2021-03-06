package com.shy.sunmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.oms.entity.OrderSettingEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单配置信息
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:43:30
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageVo queryPage(QueryCondition params);
}

