package refactoring;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public void send(String phone, String message) {
        System.out.println("Sending SMS to " + phone + " about " + message);
    }
}
