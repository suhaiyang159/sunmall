package com.shy.sunmall.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
@MapperScan("com.shy.sunmall.oms.pms.dao")
public class SunmallOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunmallOmsApplication.class, args);
    }

}
