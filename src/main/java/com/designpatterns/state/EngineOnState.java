package com.designpatterns.state;

/**
 * Created by mesut on 05.08.2016.
 */
public class EngineOnState implements State {

    public void on(Engine engine) {
        System.out.println("Engine is On");
    }

    public void off(Engine engine) {
        engine.setState(new EngineOffState());
        engine.stopEngine();
    }
}
