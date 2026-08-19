package com.trial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldCar {

    @Autowired
    private Engine engine;

    public void drive() {
        engine.start();
        System.out.println("Field Car is running");
    }
}