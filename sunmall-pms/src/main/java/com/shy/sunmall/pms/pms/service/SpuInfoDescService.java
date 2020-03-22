package com.shy.sunmall.pms.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.pms.pms.entity.SpuInfoDescEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu信息介绍
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 21:23:57
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageVo queryPage(QueryCondition params);
}

