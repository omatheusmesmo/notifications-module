package com.notification.enums;

import com.notification.factory.EmailNotificationFactory;
import com.notification.factory.NotificationFactoryMethod;
import com.notification.factory.PushNotificationFactory;
import com.notification.factory.WhatsappNotificationFactory;

public enum NotificationType {
    EMAIL(new EmailNotificationFactory()),
    PUSH(new PushNotificationFactory()),
    WHATSAPP(new WhatsappNotificationFactory());

    private final NotificationFactoryMethod factory;

    NotificationType(NotificationFactoryMethod notification) {
        this.factory = notification;
    }

    public NotificationFactoryMethod getFactory(){
        return factory;
    }
}
