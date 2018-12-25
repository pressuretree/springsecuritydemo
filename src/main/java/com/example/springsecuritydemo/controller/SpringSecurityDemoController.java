package com.example.springsecuritydemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Xinxin Mu
 * @Date: 2018/12/24 16:52
 * @Description:
 */
@RestController
public class SpringSecurityDemoController {
    private static final Logger logger = LoggerFactory.getLogger(SpringSecurityDemoController.class);

    @GetMapping("/user/hello")
    public String hello(){
        logger.info("hello from user");
        return "hello from user!!!";

    }

    @GetMapping("/admin/hello")
    public String world(){
        logger.info("hello from admin");
        return "hello from admin!!!";
    }
}
