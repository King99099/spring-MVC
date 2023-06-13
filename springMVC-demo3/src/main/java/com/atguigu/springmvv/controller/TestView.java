package com.atguigu.springmvv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:TestView
 * Package: com.atguigu.springmvv.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/1 - 10:26
 * @Version: v1.0
 */
@Controller
public class TestView {
    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(HttpServletRequest request){
        String requestValue = (String) request.getAttribute("RequestValue");
        System.out.println(requestValue);
        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward(HttpServletRequest request){
        request.setAttribute("RequestValue","Hello Forward");
        return "forward:/testThymeleafView";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(HttpServletRequest request){
        request.setAttribute("RequestValue","hello Redirect");
        return "redirect:/testThymeleafView";
    }

    /**
     * 转发和重定向的区别
     * 1\转发地址栏不变,重定向地址栏为重定向后的地址
     * 2\转发是一次请求 ,重定向是两次请求
     * 3\转发是服务器内部资源,重定向可以定位到外部资源
     * 4\转发可以共享request数据,重定向无法共享数据
     */
}
