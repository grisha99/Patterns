package ru.grishenko.patterns.structural.adapter;

import ru.grishenko.patterns.generative.Item;
import ru.grishenko.patterns.structural.composite.Discounted;

import java.math.BigDecimal;
import java.util.List;

public class OrderDto implements Discounted {

    private Long id;
    private String user;
    private List<Item> itemList;

    private BigDecimal discount;

    @Override
    public BigDecimal getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}
