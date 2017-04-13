package com.tlw.spring.practice.ch03_adv.e05_combin_anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 唐力伟 on 2017/4/9 12:16.
 */
@MyConfiguration("com.tlw.spring.practice.ch03_adv.e05_combin_anno")
public class DemoConfig {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService service = context.getBean(DemoService.class);
        service.outputResult();
        context.close();
    }
}
