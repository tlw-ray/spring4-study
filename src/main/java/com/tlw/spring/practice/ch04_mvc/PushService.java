package com.tlw.spring.practice.ch04_mvc;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by 唐力伟 on 2017/4/12 22:05.
 */
@Service
public class PushService {
    private DeferredResult<String> deferredResult;
    public DeferredResult<String> getAsyncUpdate(){
        deferredResult = new DeferredResult<String>();
        return deferredResult;
    }

    @Scheduled(fixedDelay = 5000)
    public void refresh(){
        System.out.println("xxx");
        if(deferredResult != null){
            deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
        }
    }
}
