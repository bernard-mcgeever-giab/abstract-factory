public class GoldPersonal extends CurrentAccount {
    // The Gold Personal has a high-max overdraft limit
    public static final int MAX_OVERDRAFT = 3500;

    public GoldPersonal(Customer accountHolder, int initBalance, int agreedOverdraftLimit) {
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