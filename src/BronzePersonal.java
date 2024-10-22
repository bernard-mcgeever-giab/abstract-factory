public class BronzePersonal extends CurrentAccount {
    // The Bronze Personal has a low-max overdraft limit
    public static final int MAX_OVERDRAFT = 500;

    public BronzePersonal(Customer accountHolder, int initBalance, int agreedOverdraftLimit) {
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