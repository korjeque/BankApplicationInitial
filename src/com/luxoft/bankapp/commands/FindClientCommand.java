package com.luxoft.bankapp.commands;

import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;

import com.luxoft.bankapp.exceptions.BankException;
/**
 * Created by Кирилл on 01.08.2017.
 */
public class FindClientCommand implements Command {

    private RequestCommand rCommand;

    public printCommandInfo(){
        this.rCommand = rCommand;
    }

    public void execute(Client client,Bank bank ) throws ClientExistsException {

        return bank.checkIfClientExists(client);

    }

}
