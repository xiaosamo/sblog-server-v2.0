package com.sblog.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sblog.dao.mapper")
public class SblogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SblogWebApplication.class, args);
    }

}
