package com.notification.factory;

import com.notification.channel.Notification;
import com.notification.channel.WhatsAppNotification;

public class WhatsappNotificationFactory extends NotificationFactoryMethod{

    @Override
    public Notification createNotification(){
        return new WhatsAppNotification();
    }
}
