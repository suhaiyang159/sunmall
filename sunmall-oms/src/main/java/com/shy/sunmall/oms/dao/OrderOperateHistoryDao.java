package com.shy.sunmall.oms.dao;

import com.shy.sunmall.oms.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:43:30
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
