package com.trial.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdNotificationService
        implements NotificationService {

    @Override
    public void sendNotification() {

        System.out.println(
                "PROD: Real production notification sent."
        );

    }
}