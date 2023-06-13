package com.atguigu.springmvv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName:UserController
 * Package: com.atguigu.springmvv.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/1 - 15:14
 * @Version: v1.0
 */
@Controller
public class UserController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String queryUserAll(){
        System.out.println("查询所有用户");
        return "success";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String queryUserById(@PathVariable("id") Integer id){
        System.out.println("根据ID查询用户: 用户ID=" + id);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String saveUser(String username,String password){
        System.out.println("添加用户");
        System.out.println("username= " + username + " , password= " + password);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(String username,String password){
        System.out.println("修改用户");
        System.out.println("username= " + username + " , password= " + password);
        return "success";
    }
}
