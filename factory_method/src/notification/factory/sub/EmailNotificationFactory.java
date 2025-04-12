package notification.factory.sub;

import notification.Notification;
import notification.factory.NotificationFactory;
import notification.impl.EmailNotification;

public class EmailNotificationFactory extends NotificationFactory {
    public Notification createNotification() {
        return new EmailNotification();
    }
}