package com.atguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:TestController
 * Package: com.atguigu.springmvc.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/5 - 17:08
 * @Version: v1.0
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
