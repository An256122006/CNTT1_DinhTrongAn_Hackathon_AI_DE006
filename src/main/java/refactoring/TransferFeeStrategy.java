package refactoring;

@FunctionalInterface
public interface TransferFeeStrategy {
    double calculateFee(double amount);
}
