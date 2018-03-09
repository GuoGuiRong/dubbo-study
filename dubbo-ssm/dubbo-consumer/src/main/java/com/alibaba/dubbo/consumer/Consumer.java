package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GuiRunning on 2018/3/5.
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermisson(1L));
    }
}
