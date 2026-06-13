package com.example.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SMSNotificationService implements NotificationService {
    public void send(String msg){
        System.out.println("SMS sent by SMS notification service " + msg);
    }
}
