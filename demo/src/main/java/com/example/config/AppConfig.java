package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.lifecyclebean.LifeCycleBean;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    
    @Bean(initMethod =  "init", destroyMethod = "cleanUp")
    public LifeCycleBean lifeCycleBean(){
        return new LifeCycleBean();

    }

}
