package com.tianyuan.demo.controller;

import com.tianyuan.demo.entity.Order;
import com.tianyuan.demo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/order")
    public List<Order> query() {
        return orderMapper.selectAllOrder();
    }
}
