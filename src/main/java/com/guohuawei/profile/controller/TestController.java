package com.guohuawei.profile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @title: TestController
 * @projectName profile
 * @description: TODO
 * @date 2019/5/21 17:45
 */
@RequestMapping("/")
@RestController
public class TestController {
    /**
     * hello
     * @return
     */
    @GetMapping("getHello")
    public String getHello(){
        return "hello";
    }
}
