package com.test;


import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunrd
 * @description
 * @date 2020/7/28
 */
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
// dubbo服务扫描的包
@DubboComponentScan(basePackages = "com.*")
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}