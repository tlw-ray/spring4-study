package com.tlw.spring.practice.ch03_adv.e05_combin_anno;

import org.springframework.stereotype.Service;

/**
 * Created by 唐力伟 on 2017/4/9 12:15.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}
