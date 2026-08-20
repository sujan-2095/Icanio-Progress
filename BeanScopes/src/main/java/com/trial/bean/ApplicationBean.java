package com.trial.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class ApplicationBean {
    public String getInfo() {
        return "ApplicationBean - " + this;
    }
}
