package com.qf.mybatis.service;

import com.qf.mybatis.pojo.User;

public interface UserService {
    User login(User user);

    boolean regist(User user);
}
