package com.java.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:	   <br/>
 * Date:     2021/02/01 20:55 <br/>
 *
 * @author Aaron CHEN
 * @see
 */
@SpringBootApplication(scanBasePackages = {"com.java.controller","com.java.service.impl"})
public class ShopConsumerStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopConsumerStartApplication.class);
    }
}
