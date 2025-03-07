package com.notification.factory;

import com.notification.channel.EmailNotification;
import com.notification.channel.Notification;

public class EmailNotificationFactory extends NotificationFactoryMethod{

    @Override
    public Notification createNotification(){
        return new EmailNotification();
    }
}
