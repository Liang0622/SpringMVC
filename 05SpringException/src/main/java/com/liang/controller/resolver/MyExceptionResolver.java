package com.liang.controller.resolver;

import com.liang.controller.pexception.AgeException;
import com.liang.controller.pexception.NameException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv=new ModelAndView("/errors/defaultException.jsp");//默认的异常视图
        mv.addObject("ex",ex);
        if(ex instanceof NameException){
            mv.setViewName("/errors/nameException.jsp");
        }
        if(ex instanceof AgeException){
            mv.setViewName("/errors/ageException.jsp");
        }
        return mv;
    }
}
