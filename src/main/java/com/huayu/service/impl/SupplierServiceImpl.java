package com.huayu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huayu.mapper.SupplierMapper;
import com.huayu.pojo.Supplier;
import com.huayu.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper, Supplier> implements SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public List<Supplier> queryAllSupplier(String name,String phone) {
        return supplierMapper.queryAllSupplier(name,phone);
    }
}
