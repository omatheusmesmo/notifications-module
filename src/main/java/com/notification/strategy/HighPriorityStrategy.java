package com.notification.strategy;

import com.notification.channel.Notification;
import com.notification.util.SleepUtil;

import java.util.Set;

public class HighPriorityStrategy implements NotificationPriorityStrategy{

    public void execute(Set<Notification> notifications, String message) {
        long startTime = System.currentTimeMillis();
        SleepUtil.sleepHigh();

        for(Notification notification : notifications){
            notification.sendNotification(message);
        }

        long durationInSeconds = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Total duration: " + durationInSeconds + " seconds");
    }
}
