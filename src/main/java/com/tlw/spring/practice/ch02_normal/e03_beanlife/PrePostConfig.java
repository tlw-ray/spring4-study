package com.tlw.spring.practice.ch02_normal.e03_beanlife;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 唐力伟 on 2017/4/7 23:27.
 */
@Configuration
@ComponentScan("com.tlw.springboot.study.a06_beanlife")
public class PrePostConfig {
    @Bean(initMethod="init",destroyMethod="destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }

//    @Autowired
//    BeanWayService beanWayService;
//
//    @Autowired
//    JSR250WayService jsr250WayService;


}
