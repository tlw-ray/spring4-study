package com.tlw.spring.practice.ch03_adv.e01_aware_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 唐力伟 on 2017/4/9 10:59.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService service = context.getBean(AwareService.class);
        service.outputResult();
        context.close();
    }
}
