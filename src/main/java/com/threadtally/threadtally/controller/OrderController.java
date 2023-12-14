package com.threadtally.threadtally.controller;


import com.threadtally.threadtally.entity.Item;
import com.threadtally.threadtally.entity.Order;
import com.threadtally.threadtally.pojo.ItemPojo;
import com.threadtally.threadtally.pojo.OrderPojo;
import com.threadtally.threadtally.service.ItemService;
import com.threadtally.threadtally.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("order")
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;


    @PostMapping("/save")
    public String saveOrder(@Valid @RequestBody OrderPojo orderPojo) {
        orderService.saveOrder(orderPojo);
        return "data created successfully";

    }

    @GetMapping("/get-all")
    public List<Order> findAll() {
        return orderService.findAll();
    }


    @GetMapping("/get-by-id/{id}")
    public Optional<Order> findById(@PathVariable("id") Integer id) {
        return orderService.findById(id);
    }


    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        orderService.deleteById(id);
    }
    }





