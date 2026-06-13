package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.controller.UserController;
import com.example.lifecyclebean.LifeCycleBean;
import com.example.loose.EmailNotificationService;
import com.example.loose.NotificationService;
import com.example.loose.SMSNotificationService;
// import com.example.loose.UserService;
import com.example.service.UserService;

public class Main {
    public static void main(String[] args) {
        // NotificationService notificationService = new EmailNotificationService();

        // UserService user = new UserService(notificationService);

        // user.sendNotification("Please come to the party at 7 PM today. ");

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // UserService user = appContext.getBean(UserService.class);
        // // NotificationService notificationService = appContext.getBean(SMSNotificationService.class);
        // user.sendNotification("hey everyone !! ");
        // LifeCycleBean lb = appContext.getBean(LifeCycleBean.class);
        // lb.sayHi();;

        UserController controller = appContext.getBean(UserController.class);
        controller.createUser("Alice");
        controller.createUser("Bob");
        controller.createUser("Ram");
        System.out.println(controller.listUsers());
        

    }
}