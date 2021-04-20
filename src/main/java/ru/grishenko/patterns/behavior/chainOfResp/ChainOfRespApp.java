package ru.grishenko.patterns.behavior.chainOfResp;

import ru.grishenko.patterns.generative.Item;

public class ChainOfRespApp {

    public static void main(String[] args) {
        ItemCheck check = new ItemIdChecker().link(new ItemNameChecker());
        Item item = Item.getBuilder().setId(10L).setName("name").build();
        if (check.check(item)) {
            // сохранение в БД
        }
    }
}
