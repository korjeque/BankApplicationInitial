package com.luxoft.bankapp.commands;

import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;

import com.luxoft.bankapp.exceptions.BankException;
/**
 * Created by Кирилл on 01.08.2017.
 */
public class FindClientCommand extends CommandInvoker {

    public FindClientCommand(Bank bank, Client client) {
        super(bank, client);
    }

    public void execute() throws ClientExistsException {
        if(!currentBank.checkIfClientExists(currentClient))
            throw new ClientExistsException();
    }
    @Override
    public void printCommandInfo() {
        System.out.println(currentClient.toString());
    }

}
