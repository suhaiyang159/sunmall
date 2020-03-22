package com.shy.sunmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.oms.entity.OrderEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:43:30
 */
public interface OrderService extends IService<OrderEntity> {

    PageVo queryPage(QueryCondition params);
}

