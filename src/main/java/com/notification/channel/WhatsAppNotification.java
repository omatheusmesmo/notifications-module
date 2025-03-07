package com.notification.channel;

public class WhatsAppNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending message by whatsapp");
    }
}
