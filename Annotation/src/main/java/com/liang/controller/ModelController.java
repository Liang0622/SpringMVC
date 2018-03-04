package com.liang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("/model")
public class ModelController {
    @RequestMapping("/add")
    public String add(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了ModelAdd");
        return "success";
    }

    @RequestMapping("update")
    public String update(HttpServletRequest request,HttpServletResponse response){
        System.out.println("进入了ModelUpdate");
        return "success";
    }

    @RequestMapping("/**/delete")
    public String delete(HttpServletRequest request,HttpServletResponse response){
        System.out.println("进入了ModelDelete");
        return "success";
    }


}
