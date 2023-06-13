package com.atguigu.mvc.requestmapping;

import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName:TestRequestMapping
 * Package: com.atguigu.mvc
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/30 - 18:11
 * @Version: v1.0
 */
@Controller
public class TestRequestMapping {
    //RequestMapping value属性
    @RequestMapping("/testRequestMapping")
    public String testRequestMapping1(){
        return "success";
    }
    @RequestMapping({"/test","/testValue"})
    public String testRequestMapping2(){
        return "success";
    }
    //RequestMapping Method属性
    //@getMapping
    //@postMapping
    @RequestMapping(
            value = {"/test1","/test2"},
            method = {RequestMethod.GET,RequestMethod.POST}
    )
  /*  @GetMapping("")
    @PostMapping("")*/
    public String testRequestMapping(){
        return "success";
    }

    //RequestMapping params 属性
    // "param"：要求请求映射所匹配的请求必须携带param请求参数
    // "!param"：要求请求映射所匹配的请求必须不能携带param请求参数
    // "param=value"：要求请求映射所匹配的请求必须携带param请求参数且param=value
    // "param!=value"：要求请求映射所匹配的请求必须携带param请求参数但是param!=value
    @RequestMapping(
            value = {"/test3","/test4"},
            method = {RequestMethod.GET,RequestMethod.POST},
            /* params = "username"  */
            /* params = "!username" */
            /* params = {"username","password=123456"}*/
            params = {"username","password!=123456"}
    )
    public String testRequestMappingParams(){
        return "success";
    }

    //RequestMapping   Headers

    /**
     * "header"：要求请求映射所匹配的请求必须携带header请求头信息
     * "!header"：要求请求映射所匹配的请求必须不能携带header请求头信息
     * "header=value"：要求请求映射所匹配的请求必须携带header请求头信息且header=value
     * "header!=value"：要求请求映射所匹配的请求必须携带header请求头信息且header!=value
     * 若当前请求满足@RequestMapping注解的value和method属性，但是不满足headers属性，此时页面显示404错误，即资源未找到
     */
    @RequestMapping(
            value = {"/test5","/test6"},
            method = {RequestMethod.GET,RequestMethod.POST},
            /* params = "username"  */
            /* params = "!username" */
            /* params = {"username","password=123456"}*/
            params = {"username","password!=123456"},
            headers = {"host=localhost:8080"}
    )
    public String testRequestMappingHeaders(){
        return "success";
    }


    //SpringMVC支持ant风格的路径
  /*
    ？：表示任意的单个字符
    *：表示任意的0个或多个字符
    \**：表示任意的一层或多层目录
    注意：在使用\**时，只能使用*//**//*xxx的方式
    */

  //  @RequestMapping("/a?a/test7")
    //@RequestMapping("/a*a/test7")
    @RequestMapping("/**/test7")
    public String testAnt(){
        return "success";
    }
    
    
    //SpringMVC支持路径中的占位符
    @RequestMapping("/test8/{id}/{username}")
    public String testRest(@PathVariable("id")Integer id,@PathVariable("username")String username){
        System.out.println("id = " + id + ",usernmae = " + username);
        return "success";
    }
}
