package com.liang.controller;

import com.liang.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    //@RequestParam("userName")中的userName时前端页面中的名称
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("userName") String name,int age){
        System.out.println("用户名===》"+name);
        System.out.println("年龄=====》"+age);
        ModelAndView mv=new ModelAndView("studentSuccess");
       //需要返回给前段的数据
        mv.addObject("userName",name).addObject("age",age);
        return mv;
    }

    /**
     * 前端传递的是一个对象
     */
    @RequestMapping("/addStudent")
    public ModelAndView addStudent(Student student){
        System.out.println("用户名=====》"+student.getName());
        System.out.println("年  龄=====》"+student.getAge());
        System.out.println("老师姓名===》"+student.getTeacher().getName());
        System.out.println("老师年龄===》"+student.getTeacher().getAge());

        ModelAndView mv=new ModelAndView("studentSuccess");
        mv.addObject("student",student);
        return mv;
    }
}
