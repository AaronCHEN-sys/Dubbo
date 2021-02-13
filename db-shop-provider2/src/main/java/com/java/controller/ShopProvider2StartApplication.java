package com.java.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:	   <br/>
 * Date:     2021/01/26 22:36 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@SpringBootApplication(scanBasePackages = {"com.java.controller", "com.java.service.impl"})
@MapperScan(basePackages = "com.java.mapper")
public class ShopProvider2StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopProvider2StartApplication.class);
    }
}
