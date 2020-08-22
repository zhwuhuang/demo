package com.test;


import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunrd
 * @description
 * @date 2020/7/28
 */
@RestController
public class DubboTestController {

    @DubboReference
    private DubboDemo dubboDemo;

    @RequestMapping("/hello")
    public String sayHello(){
        return dubboDemo.sayHello();
    }
}