import java.util.*;

public class Account {
    int accountNo = 0;
    float balance = 0;
    Scanner input;

    public Account() {
        this.input = new Scanner(System.in);
    }

    /**
     * Create the account with the no. and initial balance given by the user
     */
    public void createAccount() {
        System.out.println("\nEnter your account no");
        this.accountNo = this.input.nextInt();

        System.out.println("Enter your initial balance");
        this.balance = this.input.nextFloat();

        System.out.println("Account No: " + this.accountNo + " created. Balance: " + this.balance);
    }

    /**
     * Deposit the amount given by the user
     */
    public void depositFunds() {
        float depositAmount = 0;
        System.out.println("Enter deposit amount");
        depositAmount = this.input.nextFloat();

        this.balance += depositAmount;
        System.out.println(depositAmount + " deposited.\nNew Balance: " + this.balance); 
    }

    /**
     * Display the current balance
     */
    public void displayBalance() {
        System.out.println("Current Balance: " + this.balance);
    }

    public void finalize() {
        this.input.close();
    }

}