public class Main {
    public static void main( String[] args ) {
        Saving_Bank_Account savingAccount = new Saving_Bank_Account();
        Current_Bank_Account currentAccount = new Current_Bank_Account();

        savingAccount.createAccount();
        savingAccount.depositFunds();
        savingAccount.compoundMonthly();
        savingAccount.displayBalance();

        currentAccount.createAccount();
        currentAccount.withdrawAmount();
        currentAccount.displayBalance();

    }
}
