package com.atguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:TestInterceptor
 * Package: com.atguigu.springmvc.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/5 - 14:14
 * @Version: v1.0
 */
@Controller
public class TestInterceptor {

    @RequestMapping("/**/testInterceptor")
    public String testInterceptor(){
        return "success";
    }
}
