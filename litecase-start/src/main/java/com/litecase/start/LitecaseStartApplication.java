package com.litecase.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@ComponentScan("com.litecase")
//@ComponentScan(basePackages = {"com.litecase.start", "com.litecase.cord", "com.litecase.base"})
public class LitecaseStartApplication {

    @GetMapping("/user")
    public String getUser() {
            return  "user";
    }

    public static void main(String[] args) {
        SpringApplication.run(LitecaseStartApplication.class, args);
    }

}
