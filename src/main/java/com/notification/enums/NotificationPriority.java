package com.notification.enums;

import com.notification.strategy.HighPriorityStrategy;
import com.notification.strategy.LowPriorityStrategy;
import com.notification.strategy.MediumPriorityStrategy;
import com.notification.strategy.NotificationPriorityStrategy;

public enum NotificationPriority {
    LOW(new LowPriorityStrategy()),
    MEDIUM(new MediumPriorityStrategy()),
    HIGH(new HighPriorityStrategy());

    private final NotificationPriorityStrategy strategy;

    NotificationPriority(NotificationPriorityStrategy strategy) {
        this.strategy = strategy;
    }

    public NotificationPriorityStrategy getStrategy(){
        return strategy;
    }
}
