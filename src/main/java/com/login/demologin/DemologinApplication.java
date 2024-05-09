package com.login.demologin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.login.demologin.mapper")
public class DemologinApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemologinApplication.class, args);
    }

}
