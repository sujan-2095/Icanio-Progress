package com.trial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorCar {

    private final Engine engine;

    @Autowired
    public ConstructorCar(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Constructor Car is running");
    }
}