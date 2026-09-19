package com.example.notification;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("EmailService triggered");
    }
}
