package ru.grishenko.patterns.structural.bridge;

import ru.grishenko.patterns.structural.adapter.Order;

import java.util.List;
import java.util.stream.Collectors;

public class AdvancedOrderService extends OrderServiceImpl{

    ItemService itemService;

    public AdvancedOrderService(ItemService itemService) {
        this.itemService = itemService;
    }
    
    public List<Order> getAllOrderByItemId(Long id) {
        List<Order> orders = super.getAllOrders();
        return orders
                .stream()
                .filter(o ->
                        o.getItemList()
                                .stream()
                                .anyMatch(i ->
                                        i.equals(itemService.getItemById(id))))
                .collect(Collectors.toList());
    }
}
