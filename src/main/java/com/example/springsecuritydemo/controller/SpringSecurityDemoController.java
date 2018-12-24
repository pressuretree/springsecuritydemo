package com.example.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Xinxin Mu
 * @Date: 2018/12/24 16:52
 * @Description:
 */
@RestController
public class SpringSecurityDemoController {
    @GetMapping("/hello")
    public String hello(){
        return "hello from SpringSecurityDemoController";
    }
}
