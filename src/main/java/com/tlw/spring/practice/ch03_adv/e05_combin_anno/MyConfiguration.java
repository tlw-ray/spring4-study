package com.tlw.spring.practice.ch03_adv.e05_combin_anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by 唐力伟 on 2017/4/9 12:12.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface MyConfiguration {
    String[] value() default {};
}
