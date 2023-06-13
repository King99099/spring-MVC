package com.atguigu.mvc.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:UserController
 * Package: com.atguigu.mvc
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/30 - 16:01
 * @Version: v1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/list")
    public String userList(){
        return "listPage";
    }
}
