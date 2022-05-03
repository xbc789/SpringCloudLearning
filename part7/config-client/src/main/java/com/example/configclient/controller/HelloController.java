package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuyun on 2022/5/3
 **/
@RestController
public class HelloController {

    @Value("${version}")
    String version;

    @GetMapping(value = "/hello")
    public String hello(){
        return version;
    }

}
