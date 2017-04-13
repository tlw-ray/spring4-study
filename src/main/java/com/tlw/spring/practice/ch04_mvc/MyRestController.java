package com.tlw.spring.practice.ch04_mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 唐力伟 on 2017/4/13 20:35.
 */
@RestController
public class MyRestController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/testRest", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String testRest(){
        return demoService.saySomething();
    }
}
