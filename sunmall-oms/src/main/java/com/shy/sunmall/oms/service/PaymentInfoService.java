package com.shy.sunmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.oms.entity.PaymentInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 支付信息表
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:43:30
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

