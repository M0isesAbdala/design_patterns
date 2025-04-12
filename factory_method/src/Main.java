import notification.factory.NotificationFactory;
import notification.factory.sub.EmailNotificationFactory;
import notification.factory.sub.SMSNotificationFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationFactory n1 = new EmailNotificationFactory();
        n1.sendNotification();
        NotificationFactory n2 = new SMSNotificationFactory();
        n2.sendNotification();
    }
}