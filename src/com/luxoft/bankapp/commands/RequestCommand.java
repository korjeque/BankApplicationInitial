package com.luxoft.bankapp.commands;

/**
 * Created by Кирилл on 01.08.2017.
 */
public class RequestCommand {

    private String cmd = "";

    public void execute(){
        System.out.println("Stock [ Name: "+cmd);
    }
    public void printCommandInfo(){
        System.out.println("Stock [ Name: "+cmd);
    }
}