package com.tlw.spring.practice.ch04_mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 唐力伟 on 2017/4/9 21:27.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson", produces = {"application/json;charset=UTF-8"})
    public DemoObj getjson(){
        return new DemoObj(123L, "yy");
    }

    @RequestMapping(value = "/getxml", produces = {"application/xml;charset=UTF-8"})
    public DemoObj getxml(){
        return new DemoObj(222L, "zz");
    }

    @RequestMapping(value = "/getxml1", produces = {"application/xml;charset=UTF-8"})
    public DemoObj getxml1(){
        throw new RuntimeException("Test RuntimeException");
    }
}
