package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(String userName, HttpSession session){
        System.out.println("进入了login!");
        session.setAttribute("userName",userName);
        return "forward:/user/main";//转发到userController中的main
    }
}
