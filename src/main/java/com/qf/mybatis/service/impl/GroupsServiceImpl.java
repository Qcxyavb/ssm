package com.qf.mybatis.service.impl;

import com.qf.mybatis.mapper.GroupsMapper;
import com.qf.mybatis.pojo.Groups;
import com.qf.mybatis.service.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupsServiceImpl implements GroupsService {

    @Autowired
    private GroupsMapper groupsMapper;

    @Override
    public List<Groups> list() {
        return groupsMapper.list();
    }
}
