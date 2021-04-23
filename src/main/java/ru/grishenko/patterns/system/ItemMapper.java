package ru.grishenko.patterns.system;

import ru.grishenko.patterns.generative.ConnectionSingleton;
import ru.grishenko.patterns.generative.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemMapper {

    public static Item findById(Long itemId) throws SQLException {
        PreparedStatement preparedStatement = ConnectionSingleton
                .getInstance()
                .getConnection()
                .prepareStatement("SELECT * FROM items i WHERE i.id = ?");
        preparedStatement.setLong(1, itemId);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                return Item.getBuilder()
                        .setId(resultSet.getLong(1))
                        .setName(resultSet.getString(2))
                        .setPrice(resultSet.getBigDecimal(3))
                        .build();
            }
        }

        throw new IllegalArgumentException("Item by id " + itemId + " not found");
    }

    public static Item insertOrUpdate(Item item) throws SQLException {
        if (item.getId() == null) {
            return insertItem(item);
        }
        updateItem(item);
        return item;
    }

    public static Item insertItem(Item item) throws SQLException {
        PreparedStatement preparedStatement = ConnectionSingleton
                .getInstance()
                .getConnection()
                .prepareStatement("INSERT INTO items VALUES (?, ?, ?)");
        preparedStatement.setLong(1, item.getId());
        preparedStatement.setString(2, item.getName());
        preparedStatement.setBigDecimal(3, item.getPrice());
        if (preparedStatement.executeUpdate() == 0) {
            throw new SQLException("Creating item failed, no rows affected.");
        }

        try (ResultSet newId = preparedStatement.getGeneratedKeys()) {
            if (newId.next()) {
                item.setId(newId.getLong(1));
                return item;
            } else {
                throw new SQLException("Creating item failed, no ID obtained.");
            }
        }
    }

    public static void updateItem(Item item) throws SQLException {
        PreparedStatement preparedStatement = ConnectionSingleton
                .getInstance()
                .getConnection()
                .prepareStatement("UPDATE items i SET i.name=?, i.price=? WHERE i.id=?");
        preparedStatement.setString(1, item.getName());
        preparedStatement.setBigDecimal(2, item.getPrice());
        preparedStatement.setLong(3, item.getId());
        if (preparedStatement.executeUpdate() == 0) {
            throw new SQLException("Update item failed, no row affected.");
        }

    }

}
