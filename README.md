# Notification Module

This project implements a **Notification Module** that demonstrates the use of **Factory Method** and **Strategy** design patterns. It provides a simple system to handle different types of notifications (Email, SMS, Push Notification) using these patterns.

## Design Patterns Used

### 1. **Factory Method Pattern**
The **Factory Method** pattern is used to create instances of different notification types. The `NotificationFactory` class is responsible for creating the appropriate `NotificationStrategy` based on the provided input.

### 2. **Strategy Pattern**
The **Strategy** pattern is used to define a family of algorithms for sending notifications. The `NotificationStrategy` interface is implemented by various strategies (Email, SMS, Push) that define how notifications are sent.

## Project Structure

```
src/
  └── main/
      └── java/
          └── com/
              └── notification/
                  ├── strategy/
                  │   ├── NotificationStrategy.java
                  │   ├── EmailNotification.java
                  │   ├── SMSNotification.java
                  │   └── PushNotification.java
                  ├── factory/
                  │   └── NotificationFactory.java
                  └── Main.java
      └── resources/
          └── application.properties
```

## Key Components

- **NotificationStrategy**: Interface that defines the `send()` method. Each notification type (Email, SMS, Push) will implement this interface to provide specific sending logic.
  
- **EmailNotification**: Concrete implementation of `NotificationStrategy` for sending email notifications.
  
- **SMSNotification**: Concrete implementation of `NotificationStrategy` for sending SMS notifications.
  
- **PushNotification**: Concrete implementation of `NotificationStrategy` for sending push notifications.

- **NotificationFactory**: Class that contains the logic for creating different notification strategies based on the input type.

- **Main**: The main application that demonstrates how to use the factory and strategy patterns to send notifications.

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

2. The application will use the `NotificationFactory` to create the corresponding notification type (Email, SMS, or Push) and call the `send()` method.

3. The program will output the notification type and message to the console, simulating sending the notification.

## Example Output

```
Email Notification Sent: "Hello, this is an email notification!"
SMS Notification Sent: "Hello, this is an SMS notification!"
Push Notification Sent: "Hello, this is a push notification!"
```

## Contributing

Feel free to fork this repository, create branches, and submit pull requests. Contributions and improvements are welcome.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
