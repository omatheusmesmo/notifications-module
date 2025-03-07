package com.notification.channel;

public class EmailNotification implements Notification {


    public void sendNotification(String message){
        System.out.println("Sending message notification by email");
    }
}
