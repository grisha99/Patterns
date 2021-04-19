package ru.grishenko.patterns.structural.bridge;

import ru.grishenko.patterns.generative.Item;

import java.util.List;

public interface ItemService {

    List<Item> getAllItems();

    Item getItemById(Long id);
}
