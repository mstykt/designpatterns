package com.designpatterns.command;

/**
 * Created by mesut on 04.08.2016.
 */
public class AppCommand {

    public static void main(String[] args) {
        RemoteKontrol kontrol = new RemoteKontrol();
        kontrol.pressButton(0);
        kontrol.pressButton(1);
    }
}
