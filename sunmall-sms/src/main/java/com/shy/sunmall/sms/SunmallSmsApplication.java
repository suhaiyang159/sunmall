package com.shy.sunmall.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@MapperScan("com.shy.sunmall.sms.dao")
public class SunmallSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunmallSmsApplication.class, args);
    }

}
