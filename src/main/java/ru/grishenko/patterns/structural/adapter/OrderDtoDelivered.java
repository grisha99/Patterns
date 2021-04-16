package ru.grishenko.patterns.structural.adapter;

public class OrderDtoDelivered extends OrderDto implements Deliverable{

    Order order;

    public OrderDtoDelivered(Order order) {
        this.order = order;
    }

    @Override
    public String getAddress() {
        return this.order.getAddress();
    }

    @Override
    public boolean getState() {
        return this.order.getState();
    }
}
