package com.notification.strategy;

import com.notification.channel.Notification;

import java.util.Set;

public interface NotificationPriorityStrategy {

    void execute(Set<Notification> notifications, String message);
}
