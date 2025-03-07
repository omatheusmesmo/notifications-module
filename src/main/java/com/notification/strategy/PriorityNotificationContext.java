package com.notification.strategy;

import com.notification.channel.Notification;

import java.util.Set;

public class PriorityNotificationContext {

    NotificationPriorityStrategy strategy;
    Set<Notification> notifications;


    public PriorityNotificationContext(Set<Notification> notifications) {
        this.notifications = notifications;
    }

    public void executeStrategy(String message){
        strategy.execute(notifications, message);
    }

    public void setStrategy(NotificationPriorityStrategy strategy) {
        this.strategy = strategy;
    }
}
