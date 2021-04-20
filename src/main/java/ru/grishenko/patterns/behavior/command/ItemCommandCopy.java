package ru.grishenko.patterns.behavior.command;

import ru.grishenko.patterns.generative.Item;

public class ItemCommandCopy implements ItemCommand{

    private Item item;

    public ItemCommandCopy(Item item) {
        this.item = item;
    }

    @Override
    public Item execute() {
        return (Item) item.clone();
    }
}
