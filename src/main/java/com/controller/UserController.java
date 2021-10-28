package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//    进入首页面
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
