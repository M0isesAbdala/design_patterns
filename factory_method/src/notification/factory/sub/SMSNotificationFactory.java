package notification.factory.sub;

import notification.Notification;
import notification.factory.NotificationFactory;
import notification.impl.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {
    public Notification createNotification() {
        return new SMSNotification();
    }
}
