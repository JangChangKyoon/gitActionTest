package com.example.gitactiontest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/test")
    public String test(){
        String testStr = "Hi~~";
        System.out.println(testStr);
        return testStr;
    }
}
