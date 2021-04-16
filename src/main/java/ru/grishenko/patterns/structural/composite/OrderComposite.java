package ru.grishenko.patterns.structural.composite;

import java.math.BigDecimal;
import java.util.List;

public class OrderComposite {

    private List<Discounted> discountedList;

    public void add(Discounted order) {
        discountedList.add(order);

    }

    public void setDiscount(BigDecimal discount) {
        for (Discounted item : discountedList) {
            item.setDiscount(discount);
        }
    }


}
