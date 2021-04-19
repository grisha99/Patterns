package ru.grishenko.patterns.structural.decorator;

import ru.grishenko.patterns.structural.adapter.Order;

public interface DaoOrderRepository {

    boolean save(Order order);
}
