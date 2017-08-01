package com.luxoft.bankapp.commands;

/**
 * Created by Кирилл on 01.08.2017.
 */
import com.luxoft.bankapp.exceptions.BankException;
import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.model.Account;
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;

import java.util.ArrayList;
import java.util.List;

abstract public class CommandInvoker {
    protected Bank currentBank;
    protected Client currentClient;
    protected Account currentAccount;
    protected List<Client> clients = new ArrayList<Client>();
    protected List<Account> accounts = new ArrayList<Account>();


    public CommandInvoker(Bank bank, Client client){
        currentBank = bank;
        currentClient  = client;
    }
}
