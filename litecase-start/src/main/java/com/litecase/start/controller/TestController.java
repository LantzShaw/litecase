package com.litecase.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class TestController {
    @GetMapping("/list")
    public String getHello() {
        return "hello, spring boot!";
    }
}
