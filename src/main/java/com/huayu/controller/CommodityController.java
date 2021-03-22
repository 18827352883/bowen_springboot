package com.huayu.controller;

import com.huayu.pojo.Commodity;
import com.huayu.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("commodity")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    @RequestMapping("/queryAllCommodity")
    public List<Commodity> queryAllCommodity(){
        return commodityService.queryAllCommodity();
    }
}
