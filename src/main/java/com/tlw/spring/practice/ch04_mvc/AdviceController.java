package com.tlw.spring.practice.ch04_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 唐力伟 on 2017/4/10 20:44.
 */
@Controller
public class AdviceController {
    @RequestMapping(value = "/advice", produces = "text/plain;charset=UTF-8")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj){
        throw new IllegalArgumentException(("非常抱歉, 参数有误/" + "来自@ModelAttribute: " + msg));
    }
}
