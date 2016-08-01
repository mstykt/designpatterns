package com.designpatterns.builder;

/**
 * Created by mesut on 01.08.2016.
 */
public class Model {

    private String modelName;

    public Model(String modelName) {
        setModelName(modelName);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
