package com.tlw.spring.practice.ch01_base.e02_bean;


/**
 * Created by 唐力伟 on 2017/3/27 21:28.
 */
public class UseFunctionService {
    FunctionService functionService;
    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
