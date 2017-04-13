package com.tlw.spring.practice.ch01_base.e01_di;

import org.springframework.stereotype.Service;

/**
 * Created by 唐力伟 on 2017/3/27 21:03.
 */

@Service
public class FunctionService {

    public String sayHello(String word){
        return "Hello " + word + " !";
    }
}
