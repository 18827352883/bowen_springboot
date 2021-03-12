package com.huayu.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.huayu.pojo.User;
import com.huayu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询
     * @return
     */
    @RequestMapping("/queryAllUser")
    public List<User> queryAllUser(){
        return userService.queryAllUser();
    }

    /**
     * 添加
     * @RequestBody主要用来接收前端传递给后端的json字符串中的数据的(请求体中的数据的)
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    public boolean addUser(@RequestBody  User user){
        return userService.save(user);
    }

    /**
     * 根据ID删除
     * @PathVariable：从路径上取值
     * @param uid
     * @return
     */
    @RequestMapping("/delUserById/{uid}")
    public boolean delUserById(@PathVariable("uid") String uid){
        return userService.removeById(uid);
    }

    /**
     * 批量删除
     * void是无返回值
     * @param ids
     */
    @RequestMapping("/delUserByIds")
    public void delUserByIds(String ids){
        userService.removeByIds(Arrays.asList(ids));
    }

    /**
     * 修改
     * @RequestBody主要用来接收前端传递给后端的json字符串中的数据的(请求体中的数据的)
     * @param user
     * @return
     */
    @RequestMapping("/updUser")
    public boolean updUser(@RequestBody User user){
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("uid",user.getUid());
        return userService.update(user,updateWrapper);
    }

}
