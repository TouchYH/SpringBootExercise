package com.touch.slf4j.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
//@RestController("/test")
public class TestController {


    private final static Logger logger = (Logger) LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/log")
    public String testLog(){
//        logger.debug("========debug测试=============");
        logger.info("========info测试===========");
//        logger.error("==========error测试===========");
//        logger.warn("==========warn测试=============");

        String str1 = "blog.itcodai.com";
        String str2 = "blog.csdn.net/eson_18";
        logger.info("===========博客:{};CSDN:{}");

        return "success";
    }








}
