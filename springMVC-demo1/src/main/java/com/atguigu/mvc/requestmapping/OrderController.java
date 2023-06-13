package com.atguigu.mvc.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:OrderController
 * Package: com.atguigu.mvc
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/30 - 16:02
 * @Version: v1.0
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @RequestMapping("/list")
    public String orderList(){
        return "listPage";
    }
}
