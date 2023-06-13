package com.atguigu.mvc.requestmapping;

import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:controller
 * Package: com.atguigu.mvc
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/30 - 15:28
 * @Version: v1.0
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
