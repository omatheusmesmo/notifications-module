package com.notification.channel;

public class PushNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending message by push");
    }
}
