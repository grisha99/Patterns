package ru.grishenko.patterns.structural.composite;

import java.math.BigDecimal;

public interface Discounted {

    BigDecimal getDiscount();
    void setDiscount(BigDecimal discount);


}
