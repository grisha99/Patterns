package ru.grishenko.patterns.behavior.chainOfResp;

import ru.grishenko.patterns.generative.Item;

public class ItemNameChecker extends ItemCheck {

    @Override
    public boolean check(Item item) {
        if (isUniq(item)) {
            return true;
        }

        return checkNext(item);
    }

    private boolean isUniq(Item item) {
        // логика проверки уникальности имени
        return false;
    }
}
