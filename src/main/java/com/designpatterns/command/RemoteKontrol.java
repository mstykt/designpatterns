package com.designpatterns.command;

/**
 * Created by mesut on 04.08.2016.
 */
public class RemoteKontrol {

    private Command[] buttons = new Command[2];

    public RemoteKontrol() {
        Tv tv = new Tv();
        buttons[0] = new TurnOn(tv);
        buttons[1] = new TurnOff(tv);
    }

    public void pressButton(int i) {
        if (i > buttons.length || i < 0) {
            throw new RuntimeException("Invalid Button!");
        }
        buttons[i].execute();
    }
}
