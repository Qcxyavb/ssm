package com.qf.mybatis.pojo;

import org.apache.commons.lang.StringUtils;

public class Groups {

    private Integer id;
    private String name;
    private Integer userNum;

    @Override
    public String toString() {
        return "Groups{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userNum=" + userNum +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public Groups() {
    }

    public Groups(Integer id, String name, Integer userNum) {
        this.id = id;
        this.name = name;
        this.userNum = userNum;
    }
}
