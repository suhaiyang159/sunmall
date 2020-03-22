package com.shy.sunmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.sms.entity.CouponSpuCategoryRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 优惠券分类关联
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:54:47
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

