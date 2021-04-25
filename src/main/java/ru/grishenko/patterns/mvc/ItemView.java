package ru.grishenko.patterns.mvc;

import ru.grishenko.patterns.generative.Item;

public class ItemView {

    public void printItemDetails(Item item) {
        System.out.printf("Item: id=%d, name=%s, price=%f\n", item.getId(), item.getName(), item.getPrice());
    }
}
