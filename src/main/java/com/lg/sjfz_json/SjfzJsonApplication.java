package com.lg.sjfz_json;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient //开启nacos的注解
@MapperScan("com.lg.sjfz_json.mapper")
@ComponentScan(basePackages = "com.lg")
public class SjfzJsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SjfzJsonApplication.class, args);
    }

}
