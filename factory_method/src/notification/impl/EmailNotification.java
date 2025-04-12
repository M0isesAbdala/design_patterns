package notification.impl;

import notification.Notification;

public class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Enviando notificação por email.");
    }
}