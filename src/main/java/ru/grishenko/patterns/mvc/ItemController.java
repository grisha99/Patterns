package ru.grishenko.patterns.mvc;

import ru.grishenko.patterns.generative.Item;

public class ItemController {

    private ItemView view;
    private Item item;

    public ItemController(ItemView view, Item item) {
        this.view = view;
        this.item = item;
    }

    public void updateView() {
        view.printItemDetails(item);

    }
}
