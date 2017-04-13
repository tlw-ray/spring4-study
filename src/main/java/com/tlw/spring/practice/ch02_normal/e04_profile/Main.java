package com.tlw.spring.practice.ch02_normal.e04_profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 唐力伟 on 2017/4/9 9:04.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());
        context.close();
    }
}
