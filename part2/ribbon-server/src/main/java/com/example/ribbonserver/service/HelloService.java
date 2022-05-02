package com.example.ribbonserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yuyun on 2022/5/2
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name) {
        // 通过eureka-client分发到其他服务实例上
        return restTemplate.getForObject("http://eureka-client/hello?name=" + name, String.class);
    }
}
