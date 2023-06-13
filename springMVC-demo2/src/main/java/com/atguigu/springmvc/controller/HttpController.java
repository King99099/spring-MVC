package com.atguigu.springmvc.controller;

import com.atguigu.springmvc.bean.Employee;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:HttpController
 * Package: com.atguigu.springmvc.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/2 - 11:26
 * @Version: v1.0
 */
@Controller
public class HttpController {
    @RequestMapping(value = "testRequestBodyForGet",method = RequestMethod.GET)
    public String testRequestBodyForGet(@RequestBody String requestBody){
        System.out.println("requestBody = " + requestBody);
        return "success";
    }
    @RequestMapping(value = "testRequestBodyForPost",method = RequestMethod.POST)
    public String testRequestBodyForPost(@RequestBody String requestBody){
        System.out.println("requestBody = " + requestBody);
        return "success";
    }

    @RequestMapping(value = "/testRequestEntityForGet")
    public String testRequestEntityForGet(RequestEntity<String> requestEntity){
        System.out.println("requestEntity.getHeaders() = " + requestEntity.getHeaders());
        System.out.println("requestEntity.getBody() = " + requestEntity.getBody());
        return "success";
    }

    @RequestMapping(value = "/testRequestEntityForPost",method = RequestMethod.POST)
    public String testRequestEntityForPost(RequestEntity<String> requestEntity){
        System.out.println("requestEntity.getHeaders() = " + requestEntity.getHeaders());
        System.out.println("requestEntity.getBody() = " + requestEntity.getBody());
        return "success";
    }

    @RequestMapping(value = "/testResponseBody" )
    @ResponseBody
    public String testResponseBody(){
        return "ResponseBody";
    }

    @RequestMapping(value = "/testResponseEmployee")
    @ResponseBody
    public Employee testResponseEmployee(){
        return new Employee(1003,"Lucy","lucy988@163.com",1);
    }

    @RequestMapping(value = "/testAjax")
    @ResponseBody
    public String testAjax(String username,String password){
        System.out.println("UserName= " +username + ", Password= " + password );
        return "Hello Ajax";
    }
}
