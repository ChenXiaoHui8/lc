package com.qianyuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.qianyuan.dao")
@MapperScan(basePackages = {"com.qianyuan.dao"})
public class LcApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcApplication.class, args);
    }

}

