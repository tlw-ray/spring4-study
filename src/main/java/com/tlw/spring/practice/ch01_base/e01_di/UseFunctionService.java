package com.tlw.spring.practice.ch01_base.e01_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 唐力伟 on 2017/3/27 21:03.
 */
@Service
public class UseFunctionService {
    @Autowired(required = true)
    FunctionService functionService;
    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
