package com.qf.mybatis.mapper;

import com.qf.mybatis.pojo.User;

public interface UserMapper {
    public User get(String username);

    public void insert(User user);
}
