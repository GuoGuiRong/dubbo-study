package com.alibaba.dubbo.service.impl;

import com.alibaba.dubbo.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GuiRunning on 2018/3/5.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermisson(Long id) {
        List<String> result = new ArrayList<>();
        result.add(String.format("Permission_%d",id-1));
        result.add(String.format("Permission_%d",id));
        result.add(String.format("Permission_%d",id+1));
        return result;
    }

    public static String remove(String source,String sub){
        return source.replaceAll(sub,"");
    }

    public static String removeOp(String source,String sub){
        return source.replace(sub,"");
    }

}


