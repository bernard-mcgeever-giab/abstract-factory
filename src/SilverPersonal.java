public class SilverPersonal extends CurrentAccount {
    // The Silver Personal has a mid-max overdraft limit
    public static final int MAX_OVERDRAFT = 1200;

    public SilverPersonal(Customer accountHolder, int initBalance, int agreedOverdraftLimit) {
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