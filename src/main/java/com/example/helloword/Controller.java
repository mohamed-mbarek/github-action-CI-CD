package com.example.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {
    //demo
    @GetMapping
    public String hello2(){
        return "CI-CD- Azure -- DevOps Lab 4";
    }
}
