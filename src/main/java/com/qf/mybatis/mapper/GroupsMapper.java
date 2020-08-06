package com.qf.mybatis.mapper;

import com.qf.mybatis.pojo.Groups;

import java.util.List;

public interface GroupsMapper {

    public List<Groups> list();

    public Groups get(Integer group_id);
    public void update(Groups groups);
}
