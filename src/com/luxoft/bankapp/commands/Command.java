package com.luxoft.bankapp.commands;

import com.luxoft.bankapp.exceptions.BankException;
import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;

/**
 * Created by Кирилл on 01.08.2017.
 */
public interface Command {

       void execute(Client client, Bank bank) throws BankException, ClientExistsException;
       void printCommandInfo();
       void CommandInvoker();
}
