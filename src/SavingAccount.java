import java.time.LocalDate;
import java.util.UUID;

public abstract class SavingAccount {
    private final String accountUID = UUID.randomUUID().toString();
    private final Customer accountHolder;
    private final LocalDate dateOpened;
    private double balance;

    public SavingAccount(Customer accountHolder, LocalDate dateOpened, double initBalance) {
        this.accountHolder = accountHolder;
        this.dateOpened = dateOpened;
        this.balance = initBalance;
    }

    public void addFunds(final int amount) {
        balance += amount;
    }

    public void withdrawFunds(final int amount) {
        balance -= amount;
    }

    // Enforces concrete classes to override this method
    public abstract void addInterest();

    public String getAccountUID() {
        return accountUID;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public LocalDate getDateOpened() {
        return dateOpened;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}