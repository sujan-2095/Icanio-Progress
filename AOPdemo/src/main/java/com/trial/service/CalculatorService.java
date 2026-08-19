package com.trial.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) {

        System.out.println("Executing add()");

        return a + b;
    }

    public int subtract(int a, int b) {

        System.out.println("Executing subtract()");

        return a - b;
    }

    public int divide(int a, int b) {

        System.out.println("Executing divide()");

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a / b;
    }
}