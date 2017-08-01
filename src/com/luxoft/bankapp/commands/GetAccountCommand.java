package com.luxoft.bankapp.commands;

import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;

/**
 * Created by Кирилл on 01.08.2017.
 */
public class GetAccountCommand implements Command {

    Client currentClient;
    public void execute(Client client,Bank bank ) throws ClientExistsException {
        if(bank.checkIfClientExists(client)){
            currentClient = client;
        }
    }
    @Override
    public void printCommandInfo() {
        System.out.println(currentClient.toString());
    }

}
