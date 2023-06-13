package com.atguigu.springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * ClassName:ExceptionController
 * Package: com.atguigu.springmvc.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/5 - 15:45
 * @Version: v1.0
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String testException(Exception ex , Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
