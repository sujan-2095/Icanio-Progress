package com.trial.bean;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public String getInfo() {

        return "Singleton Bean - " + this;
    }
}