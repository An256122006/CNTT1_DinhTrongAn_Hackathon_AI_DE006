package refactoring;

public class PushNotificationSender implements NotificationSender {
    @Override
    public void send(String phone, String message) {
        System.out.println("Sending Push Notification to " + phone + " about " + message);
    }
}
