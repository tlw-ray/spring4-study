package com.tlw.spring.practice.ch02_normal.e03_beanlife;

/**
 * Created by 唐力伟 on 2017/4/7 23:21.
 */
//@Service
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
