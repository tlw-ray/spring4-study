package com.tlw.spring.practice.ch04_mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 唐力伟 on 2017/4/13 20:33.
 */
@Controller
public class NormalController {
    @Autowired
    DemoService demoService;

    @RequestMapping("/normal")
    public String testPage(Model model){
        model.addAttribute("msg", demoService.saySomething());
        return "page";
    }
}
