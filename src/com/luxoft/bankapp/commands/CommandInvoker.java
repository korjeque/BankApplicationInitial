package com.luxoft.bankapp.commands;

/**
 * Created by Кирилл on 01.08.2017.
 */
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Bank> bank = new ArrayList<Bank>();
    private List<Client> client = new ArrayList<Client>();



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
