package com.luxoft.bankapp.commands;

/**
 * Created by Кирилл on 01.08.2017.
 */
public class FindClientCommand implements Command {

    private RequestCommand rCommand;

    public printCommandInfo(RequestCommand rCommand){
        this.rCommand = rCommand;
    }

    public void execute() {
        rCommand.buy();
    }

}
