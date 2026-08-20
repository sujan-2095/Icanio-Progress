package com.trial.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestBean {

    public String getInfo() {

        return "Request Bean - " + this;
    }
}