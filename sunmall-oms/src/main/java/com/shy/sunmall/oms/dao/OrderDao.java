package com.shy.sunmall.oms.dao;

import com.shy.sunmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:43:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
