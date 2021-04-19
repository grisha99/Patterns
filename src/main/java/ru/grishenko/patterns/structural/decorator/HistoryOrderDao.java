package ru.grishenko.patterns.structural.decorator;

import ru.grishenko.patterns.structural.adapter.Order;

public class HistoryOrderDao extends OrderDao{

   /* DaoOrderRepository orderDao;

    public HistoryOrderDao(DaoOrderRepository daoOrderRepository) {
        orderDao = daoOrderRepository;
    }*/

    @Override
    public boolean save(Order order) {
        if (super.save(order)) {
            return writeHistory(order);
        }
        return false;
    }

    private boolean writeHistory(Order order) {
        // write changed field to history table
        return true; // or false if exception DB save
    }
}
