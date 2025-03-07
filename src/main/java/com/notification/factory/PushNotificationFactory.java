package com.notification.factory;

import com.notification.channel.Notification;
import com.notification.channel.PushNotification;

public class PushNotificationFactory extends NotificationFactoryMethod{

    @Override
    public Notification createNotification(){
        return new PushNotification();
    }
}
