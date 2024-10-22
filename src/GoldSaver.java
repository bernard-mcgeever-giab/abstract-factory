import java.time.LocalDate;

public class GoldSaver extends SavingAccount {
    // The Gold Saver has a high-interest rate
    public static final double INTEREST_RATE_MULTIPLIER = 1.05;

    public GoldSaver(Customer accountHolder, LocalDate dateOpened, double initBalance) {
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