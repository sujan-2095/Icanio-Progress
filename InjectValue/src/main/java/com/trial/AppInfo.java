package com.trial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppInfo {

    @Value("${app.name}")
    private String name;

    @Value("${app.version}")
    private String version;

    @Value("${app.port}")
    private int port;

    @Value("${app.enabled}")
    private boolean enabled;

    @Value("${app.author:Unknown}")
    private String author;

    public void displayInfo() {

        System.out.println("----- Application Information -----");

        System.out.println("Name    : " + name);
        System.out.println("Version : " + version);
        System.out.println("Port    : " + port);
        System.out.println("Enabled : " + enabled);
        System.out.println("Author  : " + author);
    }
}