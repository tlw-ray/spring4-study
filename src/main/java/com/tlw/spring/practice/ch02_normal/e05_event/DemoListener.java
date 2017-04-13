package com.tlw.spring.practice.ch02_normal.e05_event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by 唐力伟 on 2017/4/9 9:08.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("Bean-DemoListener receive bean-demoPublisher message: " + msg);
    }
}
