package com.tlw.spring.practice.ch01_base.e03_aop;

import org.springframework.stereotype.Service;

/**
 * Created by 唐力伟 on 2017/3/27 22:01.
 * step3. 注解式拦截
 */
@Service
public class DemoAnnotationService {
    @Action(name = "Anno xxxxxxx")
    public void add(){}
}
