package com.trial.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionBean {

    public String getInfo() {

        return "Session Bean - " + this;
    }
}