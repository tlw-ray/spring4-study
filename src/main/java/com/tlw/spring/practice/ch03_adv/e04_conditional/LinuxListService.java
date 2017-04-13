package com.tlw.spring.practice.ch03_adv.e04_conditional;

/**
 * Created by 唐力伟 on 2017/4/9 12:03.
 */
public class LinuxListService implements ListService {
    public String showListCmd() {
        return "ls";
    }
}
