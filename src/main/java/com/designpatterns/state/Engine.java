package com.designpatterns.state;

/**
 * Created by mesut on 05.08.2016.
 */
public class Engine {

    private State state;

    public Engine() {
        setState(new EngineOffState());
        System.out.println("Engine created. State is Off...");
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void startEngine() {
        state.on(this);
    }

    public void stopEngine() {
        state.off(this);
    }
}
