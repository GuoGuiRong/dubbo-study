package com.alibaba.dubbo.service.impl;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    public static void main(String[] args) throws Exception {

        //接受键盘输入
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            String str = input.nextLine();
            int wordCount = 0;
            //   \b表示的是一个单词的边界
            Pattern pattern = Pattern.compile("\\b\\w+\\b");
            Matcher matcher = pattern.matcher(str);
            while(matcher.find()){
                wordCount++;
            }
            System.out.println("单词的数目："+wordCount);
        }
    }

}