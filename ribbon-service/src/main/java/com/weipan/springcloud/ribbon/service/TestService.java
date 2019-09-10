package com.weipan.springcloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName TestService
 * @Author weipan
 * @Date 2019/9/10 16:58
 * @Version V1.0.0
 */
@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;


    public String test(String name) {
        return restTemplate.getForObject("http://TEST-SERVICE/test?name=" + name, String.class);
    }
}
