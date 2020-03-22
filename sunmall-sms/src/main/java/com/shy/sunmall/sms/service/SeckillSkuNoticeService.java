package com.shy.sunmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.sms.entity.SeckillSkuNoticeEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 秒杀商品通知订阅
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:54:47
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageVo queryPage(QueryCondition params);
}

