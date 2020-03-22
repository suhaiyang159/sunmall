package com.shy.sunmall.oms.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.shy.sunmall.oms.entity.RefundInfoEntity;
import com.shy.sunmall.oms.service.RefundInfoService;




/**
 * 退款信息
 *
 * @author suhaiyang
 * @email 361802334@qq.com
 * @date 2020-03-21 22:43:29
 */
@Api(tags = "退款信息 管理")
@RestController
@RequestMapping("oms/refundinfo")
public class RefundInfoController {
    @Autowired
    private RefundInfoService refundInfoService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('oms:refundinfo:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = refundInfoService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('oms:refundinfo:info')")
    public Resp<RefundInfoEntity> info(@PathVariable("id") Long id){
		RefundInfoEntity refundInfo = refundInfoService.getById(id);

        return Resp.ok(refundInfo);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('oms:refundinfo:save')")
    public Resp<Object> save(@RequestBody RefundInfoEntity refundInfo){
		refundInfoService.save(refundInfo);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('oms:refundinfo:update')")
    public Resp<Object> update(@RequestBody RefundInfoEntity refundInfo){
		refundInfoService.updateById(refundInfo);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('oms:refundinfo:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		refundInfoService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
