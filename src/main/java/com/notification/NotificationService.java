package com.notification;

import com.notification.enums.NotificationType;
import com.notification.enums.NotificationPriority;
import com.notification.channel.Notification;
import com.notification.strategy.PriorityNotificationContext;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NotificationService {
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            Set<Notification> notifications = new HashSet<>();

            System.out.println("Enter notification priority (LOW, MEDIUM, HIGH): ");
            String priorityInput = scanner.nextLine().toUpperCase();
            NotificationPriority priority = NotificationPriority.valueOf(priorityInput);

            if (priority == NotificationPriority.HIGH) {
                for (NotificationType type : NotificationType.values()) {
                    notifications.add(type.getFactory().create());
                }
            } else {
                System.out.println("Enter notification type (EMAIL, WHATSAPP, PUSH): ");
                String typeInput = scanner.nextLine().toUpperCase();
                NotificationType type = NotificationType.valueOf(typeInput);
                notifications.add(type.getFactory().create());
            }

            PriorityNotificationContext context = new PriorityNotificationContext(notifications);
            context.setStrategy(priority.getStrategy());

            System.out.println("Enter your message: ");
            String message = scanner.nextLine();
            System.out.println("Wait for a moment...");

            context.executeStrategy(message);

            System.out.println("Do you want to send another notification? (yes/no): ");
            String continueInput = scanner.nextLine().toLowerCase();
            if (!continueInput.equals("yes")) {
                break;
            }
        }
    }
}