public class CurrentAccountFactory extends AccountFactory<CurrentAccount> {
    // Concrete overridden method
    @Override
    public CurrentAccount getAccount(Customer customer) {
        final CustomerType customerType = getCustomerType(customer);

        return switch (customerType) {
            case GOLD -> new GoldPersonal(customer, 0, 0);
            case SILVER -> new SilverPersonal(customer, 0, 0);
            case BRONZE -> new BronzePersonal(customer, 0, 0);
            case BUILDER -> new CreditBuilder(customer, 0, 0);
            default -> throw new IllegalArgumentException("Unable to create account.");
        };
    }
}