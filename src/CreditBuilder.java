public class CreditBuilder extends CurrentAccount {
    // The Credit Builder does not allow for an overdraft
    public static final int MAX_OVERDRAFT = 0;

    public CreditBuilder(Customer accountHolder, int initBalance, int agreedOverdraftLimit) {
        super(accountHolder, initBalance, agreedOverdraftLimit);
    }

    // Concrete overridden method
    @Override
    public void increaseOverdraft(int requestedLimit) {
        if (requestedLimit < MAX_OVERDRAFT) {
            this.setAgreedOverdraftLimit(requestedLimit);
        }
    }
}