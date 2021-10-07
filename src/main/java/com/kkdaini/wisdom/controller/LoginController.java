package com.kkdaini.wisdom.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//登录controller不用restful，有thymeleaf方便跳转
@Slf4j
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login/index";
    }
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
