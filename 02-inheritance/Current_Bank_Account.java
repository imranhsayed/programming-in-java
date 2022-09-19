
public class Current_Bank_Account extends Account{

    /**
     * Withdraw the given amount. 
     * If the amount is more than the balance, request another amount from the user.
     */
    public void withdrawAmount() {
        float withdrawalAmount = 0;
        System.out.println("Enter withdrawal amount");
        withdrawalAmount = this.input.nextFloat();

        if (withdrawalAmount > this.balance) {
            System.out.println("Insufficient funds. Try another amount.");
            this.withdrawAmount();
            return;
        }

        this.balance -= withdrawalAmount;
        System.out.println(withdrawalAmount + " withdrawn.\nNew Balance: " + this.balance);
    }
    
}
