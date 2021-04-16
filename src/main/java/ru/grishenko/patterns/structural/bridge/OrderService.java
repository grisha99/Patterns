package ru.grishenko.patterns.structural.bridge;

import ru.grishenko.patterns.structural.adapter.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order getOrderById(Long id);

}
