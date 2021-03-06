package com.shy.sunmall.pms.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.pms.pms.entity.CategoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品三级分类
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 21:23:57
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);
}

