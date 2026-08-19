package com.trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIExampleApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(DIExampleApplication.class, args);

        ConstructorCar constructorCar =
                context.getBean(ConstructorCar.class);

        SetterCar setterCar =context.getBean(SetterCar.class);

        FieldCar fieldCar =
                context.getBean(FieldCar.class);

        constructorCar.drive();
        setterCar.drive();
        fieldCar.drive();
    }
}