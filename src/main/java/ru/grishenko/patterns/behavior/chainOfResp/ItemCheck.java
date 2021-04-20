package ru.grishenko.patterns.behavior.chainOfResp;

import ru.grishenko.patterns.generative.Item;

public abstract class ItemCheck {

    private ItemCheck next;

    public ItemCheck link(ItemCheck newItemCheck) {
        if (newItemCheck != null) {
            this.next = newItemCheck;
            return newItemCheck;
        }
        return this;
    }

    public abstract boolean check(Item item);

    public boolean checkNext(Item item) {
        if (next == null) {
            return false;
        }
        return next.check(item);
    }
}
