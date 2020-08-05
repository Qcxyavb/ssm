package com.qf.mybatis.controller;

import com.qf.mybatis.pojo.Emp;
import com.qf.mybatis.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/get")
    public String get(Integer id, Model model) {
        Emp emp = empService.get(id);
        model.addAttribute("emp", emp); // 存到request的作用域
        return "forward:/emp.jsp"; //请求转发到emp.jsp页面
    }
}