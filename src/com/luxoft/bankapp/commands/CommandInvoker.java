package com.luxoft.bankapp.commands;

/**
 * Created by Кирилл on 01.08.2017.
 */
import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
