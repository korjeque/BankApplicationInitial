package com.luxoft.bankapp.commands;

import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;

/**
 * Created by Кирилл on 01.08.2017.
 */
public class GetAccountCommand extends CommandInvoker {


    @Override
    public void execute() throws ClientExistsException {

        if(currentBank.checkIfClientExists(currentClient)){
            currentBank.checkIfClientExists(currentClient);
        }else {
            throw new ClientExistsException;
        }
    }
    @Override
    public void printCommandInfo() {
        System.out.println(currentClient.toString());
    }

}
