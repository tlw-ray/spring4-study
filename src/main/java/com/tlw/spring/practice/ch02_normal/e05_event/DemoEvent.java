package com.tlw.spring.practice.ch02_normal.e05_event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by 唐力伟 on 2017/4/9 9:07.
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
