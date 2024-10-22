//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final CreditAgencyGateway creditAgencyGateway = new CreditAgencyGateway();

        // Get customer. Change name to change outputted account types.
        final Customer customer = creditAgencyGateway.getCustomer("Hermione");

        // Capture correct concrete factory
        AccountFactory<?> accountFactory = AccountFactory.getAccountFactory(AccountType.CURRENT);

        // Get correct account
        final CurrentAccount currentAccount = (CurrentAccount) accountFactory.getAccount(customer);
        System.out.println(currentAccount.getClass());

        // Capture correct concrete factory
        accountFactory = AccountFactory.getAccountFactory(AccountType.SAVINGS);

        // Get correct account
        final SavingAccount savingAccount = (SavingAccount) accountFactory.getAccount(customer);
        System.out.println(savingAccount.getClass());
    }
}