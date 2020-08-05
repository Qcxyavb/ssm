package com.qf.mybatis.service;


import com.qf.mybatis.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> findEmpList();
    Emp get(Integer id);
    void insert(Emp emp);
    void update(Emp emp);
    void delete(Integer id);

    void trans(Emp chen, Emp lee, double v);
}
