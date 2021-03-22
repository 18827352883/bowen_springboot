package com.huayu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.mapper.CommodityMapper;
import com.huayu.pojo.Commodity;
import com.huayu.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public List<Commodity> queryAllCommodity() {
        return commodityMapper.queryAllCommodity();
    }
}
