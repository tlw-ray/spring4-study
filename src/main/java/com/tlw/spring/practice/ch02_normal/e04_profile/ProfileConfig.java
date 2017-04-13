package com.tlw.spring.practice.ch02_normal.e04_profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by 唐力伟 on 2017/4/9 9:02.
 */

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("from production profile");
    }

}
