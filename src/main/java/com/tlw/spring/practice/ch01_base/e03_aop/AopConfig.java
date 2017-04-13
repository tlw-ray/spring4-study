package com.tlw.spring.practice.ch01_base.e03_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by 唐力伟 on 2017/3/27 21:58.
 * stop6. 配置类
 */
@Configuration
@ComponentScan("com.tlw.spring.practice.ch01_base.e03_aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
