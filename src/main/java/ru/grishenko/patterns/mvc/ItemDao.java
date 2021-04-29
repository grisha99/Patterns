package ru.grishenko.patterns.mvc;

import ru.grishenko.patterns.generative.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemDao {

    private List<Item> items;

    public List<Item> getAllItems() {
        return items;
    }

    public ItemDao() {
        items = new ArrayList<>();
        for (long i = 0; i < 5; i++) {
            items.add(Item.getBuilder()
            .setId(i + 1)
            .setName("item" + (i + 1))
            .setPrice(new BigDecimal(100.00 * (i + 1)))
            .build());
        }
    }

}
