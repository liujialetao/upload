package com.aiguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestBody
//@Controller
@RestController  //等价于 @RequestBody + @Controller
public class HelloController {

    @RequestMapping("/hello")
    public String handler01() {
        return "Hello, Spring Boot 2!";
    }

//    @RequestMapping("/hello")
//    public String handler01() {
//        return "Hello, Spring Boot 2!";
//    }


}
