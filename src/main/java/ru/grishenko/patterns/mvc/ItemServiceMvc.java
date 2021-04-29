package ru.grishenko.patterns.mvc;

import ru.grishenko.patterns.generative.Item;

import java.util.List;

public class ItemServiceMvc {

    private final ItemDao itemDao;

    public ItemServiceMvc(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public List<Item> getItems() {
        return itemDao.getAllItems();
    }
}
