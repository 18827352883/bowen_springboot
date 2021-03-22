package com.huayu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.pojo.Commodity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CommodityService extends IService<Commodity> {
    List<Commodity> queryAllCommodity();
}
