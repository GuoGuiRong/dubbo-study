package com.ggr.dubbo.provider.impl;

import com.ggr.dubbo.remote.TestService;

/**
 * Created by GuiRunning on 2018/3/9.
 */
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        return ("hello "+name+"!");
    }
}
