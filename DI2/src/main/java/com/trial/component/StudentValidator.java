package com.trial.component;

import org.springframework.stereotype.Component;

@Component("1Com")
public class StudentValidator {

    public boolean isValid(String name) {

        return name != null && !name.isBlank();
    }
}