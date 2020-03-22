package com.shy.sunmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.sms.entity.SeckillSessionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 秒杀活动场次
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:54:47
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageVo queryPage(QueryCondition params);
}

