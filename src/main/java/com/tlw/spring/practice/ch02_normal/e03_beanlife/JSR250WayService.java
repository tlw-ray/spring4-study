package com.tlw.spring.practice.ch02_normal.e03_beanlife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by 唐力伟 on 2017/4/7 23:25.
 */
//@Service
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("js250-init-method");
    }
    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy
    public void destory(){
        System.out.println("jsr250-destory-method");
    }
}
