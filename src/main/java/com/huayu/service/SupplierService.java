package com.huayu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.pojo.Supplier;

import java.util.List;

public interface SupplierService extends IService<Supplier> {
    List<Supplier> queryAllSupplier(String name,String phone);
}
