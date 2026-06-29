package refactoring;

import java.util.HashMap;
import java.util.Map;

public class TransferTypeConfig {
    private final Map<String, TransferFeeStrategy> feeStrategies = new HashMap<>();
    private final Map<String, TransferRouter> routers = new HashMap<>();
    private NotificationSender notificationSender;

    public TransferTypeConfig(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
        register("INTERNAL", new InternalTransferFee(), new InternalTransferRouter());
        register("DOMESTIC_BANK", new DomesticBankFee(), new DomesticBankRouter());
        register("INTERNATIONAL", new InternationalFee(), new InternationalRouter());
    }

    public void register(String type, TransferFeeStrategy feeStrategy, TransferRouter router) {
        feeStrategies.put(type, feeStrategy);
        routers.put(type, router);
    }

    public TransferFeeStrategy getFeeStrategy(String type) {
        TransferFeeStrategy strategy = feeStrategies.get(type);
        if (strategy == null) throw new RuntimeException("Transfer type not supported: " + type);
        return strategy;
    }

    public TransferRouter getRouter(String type) {
        TransferRouter router = routers.get(type);
        if (router == null) throw new RuntimeException("Transfer type not supported: " + type);
        return router;
    }

    public void setNotificationSender(NotificationSender sender) {
        this.notificationSender = sender;
    }

    public NotificationSender getNotificationSender() {
        return notificationSender;
    }
}
