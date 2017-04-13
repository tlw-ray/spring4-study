package com.tlw.spring.practice.ch03_adv.e02_threads;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 唐力伟 on 2017/4/9 11:18.
 */

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for(int i=0;i<10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }

        context.close();
    }
}