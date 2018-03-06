package com.liang.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor02 implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行了 拦截器222中的    ===》prehandle");
        /**
         *  如果这里为false，将不会执行后续的拦截器，也不会进入方法，
         *  但会执行拦截器1中的afterCompletion，因为拦截器1中的preHandler在拦截器2的preHandler前执行了
         *  注意，并没有执行拦截器2的afterCompletion
         */
        return true;

    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行了 拦截器222中的    ===》posthandle");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("执行了 拦截器中222的    ===》afterCompletion");
    }
}
