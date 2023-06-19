package com.sonder.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object flag = request.getSession().getAttribute("employee");
        //如果employee为空说明未登录，则重定向到主页
        if(flag == null){
            response.sendRedirect("/backend/page/login/login.html");
            return false;
        }

        if(request.getSession().getAttribute("user") == null){
            response.sendRedirect("/front/page/login.html");
            return false;
        }
        return true;
    }
}
