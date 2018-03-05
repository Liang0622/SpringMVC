package com.liang.controller;

import com.liang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/add")
    public String add(){
        System.out.println("进入了=====》add()方法");
//        return "addUser";
        return "redirect:addUser";//也不会走视图解析器，直接进本controller中的方法
//        return "forward:/WEB-INF/jsp/addUser.jsp";
    }

    //真正的新增
    @RequestMapping("/addUser")
    public String addUser(User user){
        System.out.println("进入了====》addUser");
        System.out.println("用户名："+user.getName());
        System.out.println("年龄："+user.getAge());
//        return "forward:userList";//转发到当前的controller中的方法，数据不会丢失
//        return "redirect:userList";//重定向到当前controller中的方法，数据丢失
        return "forward:/pet/list";
    }


    @RequestMapping("/userList")
    public String list(User user){
        System.out.println("进入了===》list");
        System.out.println("用户名："+user.getName());
        System.out.println("年龄："+user.getAge());
        return "forward:/WEB-INF/jsp/success.jsp";
    }
}
