package com.shy.sunmall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@MapperScan("com.shy.sunmall.pms.pms.dao")
public class SunmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunmallPmsApplication.class, args);
    }

}
