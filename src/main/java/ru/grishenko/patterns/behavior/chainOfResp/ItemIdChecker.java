package ru.grishenko.patterns.behavior.chainOfResp;

import ru.grishenko.patterns.generative.Item;

public class ItemIdChecker extends ItemCheck {

    @Override
    public boolean check(Item item) {
        if (inBase(item)) {
            return false;
        }
        return checkNext(item);
    }

    private boolean inBase(Item item) {
        // проверка наличия в БД
        return false;
    }

}
