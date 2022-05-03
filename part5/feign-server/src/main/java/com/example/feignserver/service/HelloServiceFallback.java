package com.example.feignserver.service;

import org.springframework.stereotype.Component;

/**
 * Created by yuyun on 2022/5/2
 **/
@Component
public class HelloServiceFallback implements HelloService {

    @Override
    public String hello(String name) {
        return "sry, mr " + name + " I can not connect to server .";
    }
}
