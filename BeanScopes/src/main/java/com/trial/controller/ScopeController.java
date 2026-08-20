package com.trial.controller;

import com.trial.bean.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeController {

    private final SingletonBean singletonBean;
    private final PrototypeBean prototypeBean;
    private final RequestBean requestBean;
    private final SessionBean sessionBean;
    private final ApplicationBean applicationBean;

    public ScopeController(
            SingletonBean singletonBean,
            PrototypeBean prototypeBean,
            RequestBean requestBean,
            SessionBean sessionBean,
            ApplicationBean applicationBean) {

        this.singletonBean = singletonBean;
        this.prototypeBean = prototypeBean;
        this.requestBean = requestBean;
        this.sessionBean = sessionBean;
        this.applicationBean = applicationBean;
    }

    @GetMapping("/scope")
    public String scope() {

        return """
                Singleton: %s

                Prototype: %s

                Request: %s

                Session: %s
                
                Application: %s
                """.formatted(
                singletonBean.getInfo(),
                prototypeBean.getInfo(),
                requestBean.getInfo(),
                sessionBean.getInfo(),
                applicationBean.getInfo()
        );
    }
}