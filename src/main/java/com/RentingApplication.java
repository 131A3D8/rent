package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.stars.mapper") // 扫描 Mapper 接口
public class RentingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentingApplication.class, args);
    }

}
