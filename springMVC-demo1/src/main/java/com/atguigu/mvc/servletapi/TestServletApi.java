package com.atguigu.mvc.servletapi;

import com.atguigu.mvc.pojo.User;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.lang.model.SourceVersion;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * ClassName:TestServletApi
 * Package: com.atguigu.mvc.servletapi
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/31 - 9:38
 * @Version: v1.0
 */
@Controller
public class TestServletApi {
    @RequestMapping("/servletApi")
    public String testServlet(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        System.out.println("username: " + username + ",password: " + password);
        return "success";
    }
    @RequestMapping("/servletApi1")
    public String testServlet1(String username,String password){
        System.out.println("username: " + username + ",password: " + password);
        return "success";
    }

    @RequestMapping("/servletApi2")
    public String testServlet2(
            @RequestParam(value = "user_name", required = true,defaultValue = "administrator")
            String username,
            String password,
            String[] hobby,
            @RequestHeader("host")
            String host,
            @CookieValue("JSESSIONID")
            String session
    ){
        System.out.println("username: " + username + ",password: " + password + ",hobby: " + Arrays.toString(hobby));
        System.out.println("Host : " + host);
        System.out.println("sessionID : " + session);
        return "success";
    }

    @RequestMapping("/testpojo")
    public String testPojo(@RequestParam("user_name") String username,User user){
        user.setUsername(username);
        System.out.println(user);
        return "success";
    }
}
