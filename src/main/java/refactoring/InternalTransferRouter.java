package refactoring;

public class InternalTransferRouter implements TransferRouter {
    @Override
    public void route() {
        System.out.println("Processing internal system transfer...");
    }
}
