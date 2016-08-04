package com.designpatterns.command;

/**
 * Created by mesut on 04.08.2016.
 */
public class TurnOff implements Command {

    private Tv tv = null;

    public TurnOff(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }
}
