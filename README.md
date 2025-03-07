# Notification Module

This project implements a **Notification Module** that demonstrates the use of **Factory Method** and **Strategy** design patterns. It provides a simple system to handle different types of notifications (Email, WhatsApp, Push Notification) using these patterns.

## Design Patterns Used

### 1. **Factory Method Pattern**
The **Factory Method** pattern is used to create instances of different notification types. Each notification type has its own factory class that extends the `NotificationFactoryMethod` abstract class.

### 2. **Strategy Pattern**
The **Strategy** pattern is used to define a family of algorithms for sending notifications based on their priority. The `NotificationPriorityStrategy` interface is implemented by various strategies (Low, Medium, High) that define how notifications are sent.

## Project Structure

```
src/
  └── main/
      └── java/
          └── com/
              └── notification/
                  ├── channel/
                  │   ├── EmailNotification.java
                  │   ├── Notification.java
                  │   ├── PushNotification.java
                  │   └── WhatsAppNotification.java
                  ├── enums/
                  │   ├── NotificationPriority.java
                  │   └── NotificationType.java
                  ├── factory/
                  │   ├── EmailNotificationFactory.java
                  │   ├── NotificationFactoryMethod.java
                  │   ├── PushNotificationFactory.java
                  │   └── WhatsappNotificationFactory.java
                  ├── strategy/
                  │   ├── HighPriorityStrategy.java
                  │   ├── LowPriorityStrategy.java
                  │   ├── MediumPriorityStrategy.java
                  │   ├── NotificationPriorityStrategy.java
                  │   └── PriorityNotificationContext.java
                  ├── util/
                  │   └── SleepUtil.java
                  ├── Main.java
                  └── NotificationService.java
      └── resources
```

## Key Components

- **Notification**: Interface that defines the `sendNotification(String message)` method. Each notification type (Email, WhatsApp, Push) implements this interface to provide specific sending logic.

- **NotificationFactoryMethod**: Abstract class that defines the `createNotification()` method. Each notification type has its own factory class that extends this abstract class to create instances of the notification.

- **NotificationPriorityStrategy**: Interface that defines the `execute(Set<Notification> notifications, String message)` method. Each priority level (Low, Medium, High) has its own strategy class that implements this interface to define how notifications are sent.

- **PriorityNotificationContext**: Class that uses a `NotificationPriorityStrategy` to execute the strategy for sending notifications.

- **NotificationService**: Class that handles the user interaction, allowing the user to send notifications by specifying the type and priority. It runs in a loop, allowing multiple notifications to be sent in a single execution.

## Installation and Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/omatheusmesmo/notification-module.git
    ```

2. Navigate to the project directory:
    ```bash
    cd notification-module
    ```

3. Build the project using Maven or Gradle:
   - For Maven:
     ```bash
     mvn clean install
     ```
   - For Gradle:
     ```bash
     gradle build
     ```

## Usage

1. Run the main application:
    ```bash
    java -cp target/notification-module-1.0-SNAPSHOT.jar com.notification.Main
    ```

2. The application will prompt you to enter the notification priority (LOW, MEDIUM, HIGH) and, if not HIGH, the notification type (EMAIL, WHATSAPP, PUSH). Then, you can enter the message to be sent.

3. The program will output the notification type and message to the console, simulating sending the notification. It will also display the total duration of the process in seconds.

4. You can choose to send another notification or exit the application.

## Example Output

```
Enter notification priority (LOW, MEDIUM, HIGH): HIGH
Enter your message: Hello, World!
Wait for a moment...
Sending message by email
Sending message by whatsapp
Sending message by push
Total duration: 3 seconds

Do you want to send another notification? (yes/no): no
```

## Contributing

Feel free to fork this repository, create branches, and submit pull requests. Contributions and improvements are welcome.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
