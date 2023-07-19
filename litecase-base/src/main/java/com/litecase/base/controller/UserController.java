package com.litecase.base.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import lombok.RequiredArgsConstructor;


@RequestMapping("user")
@RestController
public class UserController {

    @GetMapping("/list")
   public String getUserById() {
       return  "user";
   }
}
