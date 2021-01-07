package com.example.ellensdemo.controller;

import com.example.ellensdemo.bean.UserBean;
import com.example.ellensdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @PostMapping(value="/loginIn")
    public String login(String name, String password){
        UserBean userBean = userService.loginIn(name, password);
        if (userBean!=null)
            return "success";
        else
            return "error";
    }
}
