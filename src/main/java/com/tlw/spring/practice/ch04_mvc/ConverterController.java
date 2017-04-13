package com.tlw.spring.practice.ch04_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 唐力伟 on 2017/4/11 22:27.
 */
@Controller
public class ConverterController {
    @RequestMapping(value = "/convert", produces = {"application/x-wisely"})
    public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj){
        return demoObj;
    }
}
