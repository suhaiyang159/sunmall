package com.shy.sunmall.pms.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.pms.pms.entity.SkuInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku信息
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 21:23:57
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

