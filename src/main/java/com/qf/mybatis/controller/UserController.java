package com.qf.mybatis.controller;

import com.qf.mybatis.pojo.Groups;
import com.qf.mybatis.pojo.User;
import com.qf.mybatis.service.GroupsService;
import com.qf.mybatis.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private GroupsService groupsService;

    @RequestMapping("/gotoLogin")
    public String gotoLogin(){
        return "forward:/login.jsp";
    }

    @RequestMapping("/gotoRegister")
    public String gotoRegister(Model model){
        List<Groups> groupsList = groupsService.list();
        model.addAttribute("glist", groupsList);
        return "forward:/register.jsp";
    }

    @RequestMapping("/doLogin")
    public String doLogin(User user, Model model){
        String username = user.getUsername();
        String password = user.getPassword();
        if (StringUtils.isEmpty(username)) {
            String errorname = "用户名不能为空" ;
            model.addAttribute("errorname",errorname);

        }
        if (StringUtils.isEmpty(password)) {
            String errorpasswd = "密码不能为空" ;
            model.addAttribute("errorpasswd",errorpasswd);
        }
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return "forward:/user/gotoLogin";
        }
        User login_user = userService.login(user);
        if (null == login_user) {
            model.addAttribute("error", "登录出错，请检查你的用户名或密码！！！");
            return "forward:/user/gotoLogin";
        }
        model.addAttribute("user", login_user);
        return "forward:/main.jsp";
    }



    @RequestMapping("/doRegister")
    public String doRegister(User user, Model model) {
        //1. 注册
        boolean isok = userService.regist(user);
        if (isok) {
            model.addAttribute("msg", "注册成功");
            return "forward:/user/gotoLogin";
        } else {
            model.addAttribute("msg", "注册失败");
            return "forward:/user/gotoRegister";
        }
    }
}
