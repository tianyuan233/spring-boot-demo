package com.tianyuan.demo.controller;


import com.tianyuan.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class Helloworld {
    @GetMapping("/hello")
    public String hello(@RequestParam("nickname") String name) {
        return "hello " + name;
    }

    @GetMapping("/user/{id}")
    public User user(@PathVariable int id) {
        return new User("Qwe",id);
    }

}
