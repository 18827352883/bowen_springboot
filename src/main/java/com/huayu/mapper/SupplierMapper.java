package com.huayu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.pojo.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 供应商
 */
@Mapper
public interface SupplierMapper extends BaseMapper<Supplier> {
    List<Supplier> queryAllSupplier();
}
