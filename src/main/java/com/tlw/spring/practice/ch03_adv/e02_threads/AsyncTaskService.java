package com.tlw.spring.practice.ch03_adv.e02_threads;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by 唐力伟 on 2017/4/9 11:17.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务: " + i );
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("异步执行 + 1： " + (i + 1));
    }

}
