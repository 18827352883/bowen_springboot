package com.huayu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huayu.pojo.User;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> queryAllUser();
}
