package com.example.feignserver.controller;

import com.example.feignserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuyun on 2022/5/2
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/helloFeign")
    public String helloFeign(@RequestParam String name) {
        return helloService.hello(name);
    }
}
