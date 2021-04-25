package ru.grishenko.patterns.mvc;

import ru.grishenko.patterns.generative.Item;

import java.math.BigDecimal;

public class MvcApp {

    public static void main(String[] args) {

        Item item = Item.getBuilder().setId(1L).setName("Item1").setPrice(new BigDecimal("125.21")).build();
        ItemController controller = new ItemController(new ItemView(), item);

        controller.updateView();

        item.setName("newItemName");

        controller.updateView();
    }

}
