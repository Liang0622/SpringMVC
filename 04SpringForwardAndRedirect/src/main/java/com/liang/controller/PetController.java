package com.liang.controller;

import com.liang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pet")
public class PetController {

    @RequestMapping("/list")
    public String list(User user){
        System.out.println("进入了=====》Pet  List");
        System.out.println("用户名："+user.getName());
        System.out.println("年龄："+user.getAge());
        return "forward:/WEB-INF/jsp/success.jsp";
    }
}
