package com.qf.mybatis.service.impl;


import com.qf.mybatis.mapper.GroupsMapper;
import com.qf.mybatis.mapper.UserMapper;
import com.qf.mybatis.pojo.Groups;
import com.qf.mybatis.pojo.User;
import com.qf.mybatis.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GroupsMapper groupsMapper;

    public User login(User user){
        if (null == user) return user;
        if (StringUtils.isNotEmpty(user.getUsername())){
            User db_user = userMapper.get(user.getUsername());
            if (db_user != null){
                if (user.getPassword().equals(db_user.getPassword())){
                    return db_user;
                }
            }
        }
        return null;
    }

    public boolean regist(User user) {
        boolean isok = true;
        try {
            //1. 插入用户表一条记录
            userMapper.insert(user);
            System.out.println("插入成功");
            //2. 根据用户的groupid更新groups表中的一条记录
            Groups groups = groupsMapper.get(user.getGroup_id());
            System.out.println("获得id成功");
            if (groups != null) groups.setUserNum(groups.getUserNum() + 1);
            groupsMapper.update(groups);
            System.out.println("更新成功");
        }catch (Exception e) {
            e.printStackTrace();
            isok = false;
        }
        return isok;
    }
}
