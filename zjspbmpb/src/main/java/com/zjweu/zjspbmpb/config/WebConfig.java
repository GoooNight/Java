package com.zjweu.zjspbmpb.config;

import com.zjweu.zjspbmpb.interceptor.DoInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private DoInterceptor doInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(doInterceptor).addPathPatterns("/**").excludePathPatterns("/one/**");
    }
}
