package com.example.loose;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceLoose {
    private NotificationService notificationService;


    // public UserService(){}

    // @Autowired
    public UserServiceLoose(NotificationService notificationService){
        this.notificationService = notificationService;

    }

    public void sendNotification(String msg){
        notificationService.send(msg);
    }

}
