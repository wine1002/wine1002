package com.jiawa.wiki.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author Jiat
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

//    @Resource
//    LogInterceptor logInterceptor;
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(logInterceptor).addPathPatterns("/**").excludePathPatterns("/login");
//    }
}
