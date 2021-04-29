package ru.grishenko.patterns.mvc;

import ru.grishenko.patterns.generative.Item;

import java.util.List;

public class ItemView {

    public void printItemDetails(Item item) {
        System.out.printf("Item: id=%d, name=%s, price=%f\n", item.getId(), item.getName(), item.getPrice());
    }

    public void printItemList(List<Item> items) {
        for (Item item : items) {
            System.out.printf("Item: id=%d, name=%s, price=%f\n", item.getId(), item.getName(), item.getPrice());
        }
    }
}
