package com.lrh.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {

    @GetMapping("/id")
    public String test(){
        return "springboot test cicd,haha,hey.";
    }

}
