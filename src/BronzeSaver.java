import java.time.LocalDate;

public class BronzeSaver extends SavingAccount {
    // The Bronze Saver has a low-interest rate
    public static final double INTEREST_RATE_MULTIPLIER = 1.015;

    public BronzeSaver(Customer accountHolder, LocalDate dateOpened, int initBalance) {
        super(accountHolder, dateOpened, initBalance);
    }

    // Concrete overridden method
    @Override
    public void addInterest() {
        if (LocalDate.now().getMonth() == this.getDateOpened().getMonth()
                && LocalDate.now().getDayOfMonth() == this.getDateOpened().getDayOfMonth()) {
            this.setBalance(this.getBalance() * INTEREST_RATE_MULTIPLIER);
        }
    }
}