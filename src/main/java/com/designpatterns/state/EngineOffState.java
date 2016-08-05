package com.designpatterns.state;

/**
 * Created by mesut on 05.08.2016.
 */
public class EngineOffState implements State {

    public void on(Engine engine) {
        engine.setState(new EngineOnState());
        engine.startEngine();
    }

    public void off(Engine engine) {
        System.out.println("Engine is Off");
    }
}
