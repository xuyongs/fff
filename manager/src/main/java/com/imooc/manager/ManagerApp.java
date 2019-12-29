package com.imooc.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author: Xyong
 * @since: 2019/11/4
 */
@SpringBootApplication
@EntityScan(basePackages = {"com.imooc.entity"})
//@Import(SwaggerConfiguration.class)
public class ManagerApp {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApp.class);
    }
}
