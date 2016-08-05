package com.designpatterns.state;

/**
 * Created by mesut on 05.08.2016.
 */
public interface State {
    void on(Engine engine);
    void off(Engine engine);
}
