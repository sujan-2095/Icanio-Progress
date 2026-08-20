package com.trial.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {

    public String getInfo() {

        return "Prototype Bean - " + this;
    }
}