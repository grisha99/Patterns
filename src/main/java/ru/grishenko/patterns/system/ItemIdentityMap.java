package ru.grishenko.patterns.system;

import ru.grishenko.patterns.generative.Item;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ItemIdentityMap {

    private Map<Long, Item> items;

    public ItemIdentityMap() {
        this.items = new HashMap<>();
    }

    public Item getById(Long itemId) throws SQLException {
        if (items.containsKey(itemId)) {
            return items.get(itemId);
        }

        try {
            Item item = ItemMapper.findById(itemId);
            items.put(itemId, item);
            return item;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e);
        }

    }

    public void putItem(Item item) {
        if (item != null) {
            try {
                Item insertedItem = ItemMapper.insertOrUpdate(item);
                items.put(insertedItem.getId(), insertedItem);
            } catch (SQLException e) {
                // log Exception
            }
        }
    }
}
