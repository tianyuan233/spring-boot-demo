package com.tianyuan.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class Helloworld {
    @GetMapping("/hello")
    public String hello(@RequestParam("nickname") String name) {
        return "hello " + name;
    }

    @GetMapping("/user/{id}")
    public String user(@PathVariable int id) {
        return "user" + id;
    }

}
