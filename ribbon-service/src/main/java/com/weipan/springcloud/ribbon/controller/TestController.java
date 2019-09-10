package com.weipan.springcloud.ribbon.controller;

import com.weipan.springcloud.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName TestController
 * @Author weipan
 * @Date 2019/9/10 17:00
 * @Version V1.0.0
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "weipan") String name) {
        return testService.test(name);
    }
}
