package refactoring;

public class DomesticBankFee implements TransferFeeStrategy {
    @Override
    public double calculateFee(double amount) {
        return amount * 0.01;
    }
}
