package com.touch.helloworld.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")
public class hellocontroller {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
