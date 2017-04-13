package com.tlw.spring.practice.ch04_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 唐力伟 on 2017/4/9 20:10.
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
