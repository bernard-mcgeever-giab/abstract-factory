import java.time.LocalDate;

public class SavingAccountFactory extends AccountFactory<SavingAccount> {
    // Concrete overridden method
    @Override
    public SavingAccount getAccount(Customer customer) {
        final CustomerType customerType = getCustomerType(customer);

        return switch (customerType) {
            case GOLD -> new GoldSaver(customer, LocalDate.now(), 0);
            case SILVER -> new SilverSaver(customer, LocalDate.now(), 0);
            case BRONZE, BUILDER -> new BronzeSaver(customer, LocalDate.now(), 0);
            default -> throw new IllegalArgumentException("Unable to create account.");
        };
    }
}