package refactoring;

public class Transaction {
    private Account sender;
    private Account receiver;
    private double amount;
    private double fee;
    private String status;

    public Transaction(Account sender, Account receiver, double amount, double fee, String status) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.fee = fee;
        this.status = status;
    }

    public Account getSender() { return sender; }
    public Account getReceiver() { return receiver; }
    public double getAmount() { return amount; }
    public double getFee() { return fee; }
    public String getStatus() { return status; }
}
