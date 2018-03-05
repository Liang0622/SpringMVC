package com.liang.controller;

import com.liang.controller.pexception.AgeException;
import com.liang.controller.pexception.NameException;
import com.liang.controller.pexception.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {

    @ExceptionHandler(NameException.class)
    public ModelAndView nameException(NameException ex){
        ModelAndView mv=new ModelAndView("/errors/ageException.jsp");
        mv.addObject("ex",ex);
        return mv;
    }

    @ExceptionHandler(AgeException.class)
    public ModelAndView ageException(AgeException ex){
        ModelAndView mv=new ModelAndView("errors/ageException.jsp");
        mv.addObject("ex",ex);
        return mv;
    }

    @ExceptionHandler
    public ModelAndView defaultException(Exception ex){
        ModelAndView mv=new ModelAndView("errors/defaultException.jsp");
        mv.addObject("ex",ex);
        return mv;
    }
}


