package ru.grishenko.patterns.behavior.command;

import ru.grishenko.patterns.generative.Item;

import java.math.BigDecimal;

public class ItemCommandCreate implements ItemCommand{

    @Override
    public Item execute() {
        return Item.getBuilder().setId(null).setName("").setPrice(new BigDecimal("0.00")).build();
    }
}
