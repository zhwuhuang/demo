package com.test;


import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DubboDemoImpl implements DubboDemo {

    @Override
    public String sayHello() {
        return "hello, dubbo";
    }
}

