package com.example.feignserver.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yuyun on 2022/5/2
 **/
@FeignClient("eureka-client")
public interface HelloService {

    @GetMapping("/hello")
    String hello(@RequestParam String name);
}
