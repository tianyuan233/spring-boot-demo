package com.tianyuan.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String hello(@RequestParam("nickname") String name) {
        return "hello " + name;
    }

}
