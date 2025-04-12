package notification.factory;

import notification.Notification;

public abstract class NotificationFactory {
    Notification notification = null;

    public NotificationFactory() {
        if(this.notification == null){
            System.out.println("CLASS PAI FOI CRIADO MAS FACTORY AINDA É NULA ");
        }
    }

    public abstract Notification createNotification();

    public void sendNotification() {
        if(this.notification == null){
            notification = createNotification();
        }
        notification.notifyUser();
    }
}