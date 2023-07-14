package com.o0u0o.babytun.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <h1>静态任务StaticTask</h1>
 * ClassName: StaticTask
 * Description: 静态任务
 * 1、注解@Component：组件类，ioc容器会自动扫描到该类
 * 2、cron表达式：秒 分 时 日 月 周几
 * 3、@Scheduled：声明该方法是一个定时任务
 *
 * @Author o0u0o
 * @Date 2023/7/8 10:46 PM
 */
@Component
public class StaticTask {

    @Scheduled(cron = "0/5 * * * * ?")
    public void doStatic(){
        Date date = new Date();
        System.out.println(date);
    }
}
