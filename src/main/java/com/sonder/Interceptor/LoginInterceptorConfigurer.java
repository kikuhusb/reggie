package com.sonder.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class LoginInterceptorConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LoginInterceptor interceptor = new LoginInterceptor();
        List<String> list = new ArrayList<>();
        //白名单
        list.add("/backend/api/**");
        list.add("/backend/styles/**");
        list.add("/backend/images/**");
        list.add("/backend/js/**");
        list.add("/backend/page/login/login.html");
        list.add("/backend/plugins/**");
        list.add("/front/**");
        list.add("/employee/login");
        list.add("/user/login");
        list.add("/user/sendMsg");


        //注册拦截器
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns(list);
    }
}
