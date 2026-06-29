package refactoring;

public class InternationalRouter implements TransferRouter {
    @Override
    public void route() {
        System.out.println("Connecting to SWIFT API...");
    }
}
