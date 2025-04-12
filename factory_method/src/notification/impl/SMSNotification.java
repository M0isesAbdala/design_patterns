package notification.impl;

import notification.Notification;

public class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Enviando notificação por SMS.");
    }
}