package com.tlw.spring.practice.ch03_adv.e03_schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 唐力伟 on 2017/4/9 11:49.
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss,SSS");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每5秒执行一次: " + dateFormat.format(new Date()));
    }

    @Scheduled( cron = "* * * * * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
    }
}
