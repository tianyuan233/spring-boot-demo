package com.tianyuan.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tianyuan.demo.entity.User;
import com.tianyuan.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<User> query() {

        return userMapper.selectAllUser();
    }

    @GetMapping("/user/page")
    public IPage<User> page() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("username","w");

        Page<User> page = new Page<>(0,15);
        return userMapper.selectPage(page,queryWrapper);
    }
}
