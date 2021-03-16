package com.huayu.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.huayu.pojo.Supplier;
import com.huayu.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("supplier")
@CrossOrigin
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    /**
     * 查询
     * @return
     */
    @RequestMapping("/queryAllSupplier")
    public List<Supplier> queryAllSupplier(String name,String phone){
        return supplierService.queryAllSupplier(name,phone);
    }

    /**
     * 根据ID查询
     * @PathVariable：从路径上取值
     * @param id
     * @return
     */
    @RequestMapping("/querySupplierById/{id}")
    public Supplier querySupplierById(@PathVariable Integer id){
        return supplierService.getById(id);
    }

    /**
     * 添加
     * @RequestBody主要用来接收前端传递给后端的json字符串中的数据的(请求体中的数据的)
     * @param supplier
     * @return
     */
    @RequestMapping("/addSupplier")
    public boolean addSupplier(@RequestBody Supplier supplier){
        return supplierService.save(supplier);
    }

    /**
     * 根据ID删除
     * @param id
     * @return
     */
    @RequestMapping("/delSupplier/{id}")
    public boolean delSupplier(@PathVariable Integer id){
        return supplierService.removeById(id);
    }

    @RequestMapping("/delSupplierById")
    public boolean delSupplierById(@RequestParam String ids){
        System.out.println("哈哈哈哈哈哈"+ids);
        String[] id = ids.split(",");
        return supplierService.removeByIds(Arrays.asList(id));
    }

    /**
     * 修改
     * @RequestBody主要用来接收前端传递给后端的json字符串中的数据的(请求体中的数据的)
     * @param supplier
     * @return
     */
    @RequestMapping("/updSupplier")
    public boolean updSupplier(@RequestBody Supplier supplier){
        UpdateWrapper<Supplier> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("sid",supplier.getSid());
        return supplierService.update(supplier,updateWrapper);
    }

}
