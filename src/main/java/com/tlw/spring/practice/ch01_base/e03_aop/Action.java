package com.tlw.spring.practice.ch01_base.e03_aop;

import java.lang.annotation.*;

/**
 * Created by 唐力伟 on 2017/3/27 21:43.
 * step2. 编写拦截注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
