package com.shy.sunmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.sms.entity.SpuLadderEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品阶梯价格
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:54:46
 */
public interface SpuLadderService extends IService<SpuLadderEntity> {

    PageVo queryPage(QueryCondition params);
}

