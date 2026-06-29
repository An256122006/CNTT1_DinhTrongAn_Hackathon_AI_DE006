package refactoring;

public class Account {
    private String accountId;
    private String phone;
    private double balance;

    public Account(String accountId, String phone, double balance) {
        this.accountId = accountId;
        this.phone = phone;
        this.balance = balance;
    }

    public String getAccountId() { return accountId; }
    public String getPhone() { return phone; }
    public double getBalance() { return balance; }

    public void debit(double amount) {
        if (amount > balance) throw new RuntimeException("Insufficient balance");
        this.balance -= amount;
    }

    public void credit(double amount) {
        this.balance += amount;
    }
}
