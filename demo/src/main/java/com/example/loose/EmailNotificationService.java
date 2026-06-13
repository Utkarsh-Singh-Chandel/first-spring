package com.example.loose;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService {
    public void send(String msg){
        System.out.println("Email sent by Email notification service " + msg);
    }
}
