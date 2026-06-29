package refactoring;

public class DomesticBankRouter implements TransferRouter {
    @Override
    public void route() {
        System.out.println("Connecting to Napas API...");
    }
}
