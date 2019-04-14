package com.example.rentpig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.rentpig.mapper")
public class RentpigApplication {

    public static void main(String[] args) {
        SpringApplication springApplication=new SpringApplication(RentpigApplication.class);
        springApplication.run(args);
    }

}
