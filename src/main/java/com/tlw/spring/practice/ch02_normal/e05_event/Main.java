package com.tlw.spring.practice.ch02_normal.e05_event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 唐力伟 on 2017/4/9 9:12.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }
}
