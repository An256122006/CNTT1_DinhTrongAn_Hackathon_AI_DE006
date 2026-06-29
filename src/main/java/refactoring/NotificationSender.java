package refactoring;

@FunctionalInterface
public interface NotificationSender {
    void send(String phone, String message);
}
