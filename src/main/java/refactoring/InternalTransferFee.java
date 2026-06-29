package refactoring;

public class InternalTransferFee implements TransferFeeStrategy {
    @Override
    public double calculateFee(double amount) {
        return 0;
    }
}
