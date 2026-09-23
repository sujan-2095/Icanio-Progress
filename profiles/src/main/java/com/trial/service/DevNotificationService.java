package com.trial.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class DevNotificationService
        implements NotificationService {

    @Override
    public void sendNotification() {

        System.out.println(
                "DEV: Fake notification sent to console."
        );

    }
}
