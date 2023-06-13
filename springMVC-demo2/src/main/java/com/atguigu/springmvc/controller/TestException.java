package com.atguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:TestException
 * Package: com.atguigu.springmvc.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/5 - 15:29
 * @Version: v1.0
 */
@Controller
public class TestException {
    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler() {
        System.out.println(1/0);
        return "success";
    }
}
