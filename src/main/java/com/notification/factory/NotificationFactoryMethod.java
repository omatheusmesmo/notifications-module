package com.notification.factory;

import com.notification.channel.Notification;

public abstract class NotificationFactoryMethod {

    public Notification create() {
        return createNotification();
    }

    protected abstract Notification createNotification();
}
