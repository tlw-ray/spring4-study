package com.tlw.spring.practice.ch02_normal.e01_scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 唐力伟 on 2017/4/7 21:37.
 */
@Configuration
@ComponentScan("com.tlw.spring.practice.ch02_normal.e01_scope")
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        SingletonService s1 = context.getBean(SingletonService.class);
        SingletonService s2 = context.getBean(SingletonService.class);
        System.out.println("s1 == s2 ? " + (s1 == s2));

        PrototypeService p1 = context.getBean(PrototypeService.class);
        PrototypeService p2 = context.getBean(PrototypeService.class);
        System.out.println("p1 == p2 ? " + (p1 == p2));
    }
}
