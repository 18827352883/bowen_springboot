package com.huayu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.pojo.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityMapper extends BaseMapper<Commodity> {
    List<Commodity> queryAllCommodity();
}
