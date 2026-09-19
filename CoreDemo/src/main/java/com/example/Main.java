package com.example;

import com.example.notification.EmailService;
import com.example.notification.NotificationService;
import com.example.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        NotificationService notification = new SmsService();

        // -> 1st way of dependency injection is via constructor Refer to OrderService.java at line no. 11
//        OrderService service = new OrderService(notification);
        OrderService service = new OrderService();
        // -> 2nd way of dependency injection is via getter and setter. Refer to OrderService.java at line no. 22.
        service.setNotification(notification);
        service.placeOrder();
        }
    }

