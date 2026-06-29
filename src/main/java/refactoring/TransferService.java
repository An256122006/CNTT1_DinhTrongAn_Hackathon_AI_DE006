package refactoring;

public class TransferService {
    private final TransferTypeConfig config;

    public TransferService(TransferTypeConfig config) {
        this.config = config;
    }

    public Transaction processTransfer(Account sender, Account receiver, double amount, String transferType) {
        if (sender.getBalance() < amount) {
            throw new RuntimeException("Insufficient balance");
        }

        TransferFeeStrategy feeStrategy = config.getFeeStrategy(transferType);
        TransferRouter router = config.getRouter(transferType);
        NotificationSender notifier = config.getNotificationSender();

        double fee = feeStrategy.calculateFee(amount);
        router.route();

        sender.debit(amount + fee);
        receiver.credit(amount);

        notifier.send(sender.getPhone(), "transaction: " + transferType + " amount: " + amount);

        return new Transaction(sender, receiver, amount, fee, "SUCCESS");
    }
}
