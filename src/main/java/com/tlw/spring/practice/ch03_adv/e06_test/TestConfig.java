package com.tlw.spring.practice.ch03_adv.e06_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by 唐力伟 on 2017/4/9 14:20.
 */
@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from develop profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("from production profile");
    }
}
