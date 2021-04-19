package ru.grishenko.patterns.structural.decorator;

import ru.grishenko.patterns.structural.adapter.Order;

public class OrderDao implements DaoOrderRepository {

    @Override
    public boolean save(Order order) {
        return true; /*or false if not saved*/
    }

}
