public abstract class AccountFactory<T> {
    // Returns different concrete factory depending on AccountType
    public static AccountFactory<?> getAccountFactory(AccountType accountType) {
        return switch (accountType) {
            case SAVINGS -> new SavingAccountFactory();
            case CURRENT -> new CurrentAccountFactory();
            default -> throw new IllegalArgumentException("Unknown account type: " + accountType);
        };
    }

    // Enforces concrete factories to override this method
    public abstract T getAccount(Customer customer);

    // Returns CustomerType depending on creditScore property. Put in the abstract to reduce duplicate code
    protected CustomerType getCustomerType(Customer customer) {
        if (customer.getCreditScore() > 700) {
            return CustomerType.GOLD;
        } else if (customer.getCreditScore() > 400) {
            return CustomerType.SILVER;
        } else if (customer.getCreditScore() > 200) {
            return CustomerType.BRONZE;
        } else {
            return CustomerType.BUILDER;
        }
    }
}