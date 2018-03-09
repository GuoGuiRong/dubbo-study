package com.alibaba.dubbo.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GuiRunning on 2018/3/5.
 */
public class Provider {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
