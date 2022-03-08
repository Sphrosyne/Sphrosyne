package com.cmiot.sphrosyneservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cmiot.sphrosyne.mapper")
@SpringBootApplication
public class SphrosyneServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SphrosyneServiceApplication.class, args);
    }

}
