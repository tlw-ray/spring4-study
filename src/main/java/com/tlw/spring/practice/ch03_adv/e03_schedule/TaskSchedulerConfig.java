package com.tlw.spring.practice.ch03_adv.e03_schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by 唐力伟 on 2017/4/9 11:54.
 */
@Configuration
@ComponentScan("com.tlw.spring.practice.ch03_adv.e03_schedule")
@EnableScheduling
public class TaskSchedulerConfig {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);

    }

}
