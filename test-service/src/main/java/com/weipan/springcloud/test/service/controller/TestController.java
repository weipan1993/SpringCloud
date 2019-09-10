package com.weipan.springcloud.test.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * @ClassName TestController
 * @Author weipan
 * @Date 2019/8/23 11:23
 * @Version V1.0.0
 */
@RestController
public class TestController {

    private final static String serverID = UUID.randomUUID().toString();

    @Value("${server.port}")
    private String port;

    @RequestMapping("/test")
    public String test(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "weipan") String name) {
        return "Hi," + name + ",I am from serverID:"  + serverID;
    }
}
