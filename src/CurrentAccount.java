import java.util.UUID;

public abstract class CurrentAccount {
    private final String accountUID = UUID.randomUUID().toString();
    private final Customer accountHolder;
    private int balance;
    private int agreedOverdraftLimit;

    public CurrentAccount(Customer accountHolder, int initBalance, int agreedOverdraftLimit) {
        this.accountHolder = accountHolder;
        this.balance = initBalance;
        this.agreedOverdraftLimit = agreedOverdraftLimit;
    }

    public void addFunds(final int amount) {
        balance += amount;
    }

    public void withdrawFunds(final int amount) {
        if (amount < balance + agreedOverdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Unable to withdraw " + amount);
        }
    }

    // Enforces concrete classes to override this method
    public abstract void increaseOverdraft(int requestedLimit);

    public String getAccountUID() {
        return accountUID;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public int getAgreedOverdraftLimit() {
        return agreedOverdraftLimit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAgreedOverdraftLimit(int agreedOverdraftLimit) {
        this.agreedOverdraftLimit = agreedOverdraftLimit;
    }
}
