package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.stars.mapper")
public class RentingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentingApplication.class, args);
    }

}
