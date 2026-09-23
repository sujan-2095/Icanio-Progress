package com.trial.runner;

import com.trial.service.NotificationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final NotificationService notificationService;

    @Value("${app.environment}")
    private String environment;

    @Value("${app.notification}")
    private String notification;

    @Value("${app.debug}")
    private boolean debug;

    public AppRunner(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void run(String... args) {

        System.out.println();
        System.out.println("===== APPLICATION INFORMATION =====");

        System.out.println("Environment : " + environment);
        System.out.println("Notification: " + notification);
        System.out.println("Debug       : " + debug);

        System.out.println();

        notificationService.sendNotification();
    }
}