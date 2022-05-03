package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuyun on 2022/5/2
 **/
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String helloWorld(@RequestParam String name) {
        return "hi " + name + " , welcome to learning SpringCloud ! I am from port " + port;
    }
}
