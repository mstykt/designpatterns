package com.designpatterns.command;

/**
 * Created by mesut on 04.08.2016.
 */
public class TurnOn implements Command {

    private Tv tv = null;

    public TurnOn(Tv tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }
}
