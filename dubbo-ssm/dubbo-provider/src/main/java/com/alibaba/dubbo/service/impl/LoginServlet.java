package com.alibaba.dubbo.service.impl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by GuiRunning on 2018/3/7.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        String password = request.getParameter("password");

        /**
         * 通过用户名从数据库获取密码，进行对比
         */
        String result = "123";
        if(result.equals(password)){
           response.sendRedirect("success.jsp");
        }else{
            response.sendRedirect("error.jsp");
        }
        System.out.println("从前台传过来的数据\n"+username+";"+password);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
