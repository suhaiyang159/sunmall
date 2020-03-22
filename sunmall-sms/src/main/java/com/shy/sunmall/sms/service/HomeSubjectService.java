package com.shy.sunmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.sunmall.sms.entity.HomeSubjectEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:54:47
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

