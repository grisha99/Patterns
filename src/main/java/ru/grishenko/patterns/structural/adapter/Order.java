package ru.grishenko.patterns.structural.adapter;

import ru.grishenko.patterns.generative.Item;
import ru.grishenko.patterns.structural.composite.Discounted;
import ru.grishenko.patterns.structural.decorator.OrderDao;

import java.math.BigDecimal;
import java.util.List;

public class Order implements Deliverable, Discounted {

    private Long id;
    private String user;
    private List<Item> itemList;

    private String deliveryAddress;
    private boolean isDelivered;

    private BigDecimal discount;

    private OrderDao orderDao;

    @Override
    public String getAddress() {
        return deliveryAddress;
    }

    @Override
    public boolean getState() {
        return isDelivered;
    }

    @Override
    public BigDecimal getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public boolean save() {

        return orderDao.save(this);
    }
}
