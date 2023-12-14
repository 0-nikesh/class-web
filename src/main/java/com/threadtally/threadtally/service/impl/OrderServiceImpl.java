package com.threadtally.threadtally.service.impl;

import com.threadtally.threadtally.entity.Item;
import com.threadtally.threadtally.entity.Order;
import com.threadtally.threadtally.entity.User;
import com.threadtally.threadtally.pojo.OrderPojo;
import com.threadtally.threadtally.repository.ItemRepository;
import com.threadtally.threadtally.repository.OrderRepository;
import com.threadtally.threadtally.repository.UserRepository;
import com.threadtally.threadtally.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;
    private final UserRepository userRepository;


    @Override
    public void Order(OrderPojo orderPojo) {

    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        orderRepository.deleteById(id);

    }

    @Override
    public void saveOrder(OrderPojo orderPojo) {
        Order order = new Order();

        Item item= itemRepository.findById(orderPojo.getItemId()).get();
        order.setItem(item);

        User user= userRepository.findById(orderPojo.getUserId()).get();
        order.setUser(user);

        order.setSales_quantity(orderPojo.getSalesQuantity());
        orderRepository.save(order);


    }
}
