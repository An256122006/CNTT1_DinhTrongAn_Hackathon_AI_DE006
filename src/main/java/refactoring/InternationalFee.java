package refactoring;

public class InternationalFee implements TransferFeeStrategy {
    @Override
    public double calculateFee(double amount) {
        return amount * 0.03 + 50000;
    }
}
