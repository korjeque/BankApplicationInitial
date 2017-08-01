package com;

import java.util.Scanner;

import com.luxoft.bankapp.commands.Command;
import com.luxoft.bankapp.commands.FindClientCommand;
import com.luxoft.bankapp.commands.GetAccountCommand;
import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.model.Bank;
import com.luxoft.bankapp.model.Client;

public class BankCommander {

    public static Bank currentBank = new Bank();
    public static Client currentClient;

    static Command[] commands = {
            new FindClientCommand(currentClient,currentBank),
            new GetAccountCommand(currentClient,currentBank), // 2
            // etc.
            new Command() { // 7 - Exit Command
                public void execute() {
                    System.exit(0);
                }

                public void printCommandInfo() {
                    System.out.println("Exit");
                }
            }
    };


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < commands.length; i++) {
                System.out.print(i + ") ");
                commands[i].printCommandInfo();
            }
            String commandString = s.nextLine();
            int command = 0;
            // initialize command with commandString
            commands[command].execute();
        }
    }
}
