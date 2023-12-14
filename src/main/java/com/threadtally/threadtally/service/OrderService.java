package com.threadtally.threadtally.service;

import com.threadtally.threadtally.entity.Order;
import com.threadtally.threadtally.pojo.OrderPojo;
import com.threadtally.threadtally.pojo.OrderPojo;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    void Order(OrderPojo orderPojo);

    List<Order> findAll();

    Optional<Order> findById(Integer id);

    void deleteById(Integer id);

    void saveOrder(OrderPojo orderPojo);
}
