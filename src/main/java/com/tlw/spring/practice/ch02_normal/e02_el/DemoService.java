package com.tlw.spring.practice.ch02_normal.e02_el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by 唐力伟 on 2017/4/7 22:40.
 */
@Service
public class DemoService {
    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
