import java.util.*;

public class Account {
    int accountNo = 0;
    float balance = 0;
    Scanner input;

    public Account() {
        this.input = new Scanner(System.in);
    }

    public void createAccount() {
        System.out.println("Enter your account no");
        
        this.accountNo = this.input.nextInt();
        System.out.println("Enter your initial balance");
        this.balance = this.input.nextFloat();
        System.out.println("Account No: " + this.accountNo + " created. Balance: " + this.balance);
    }

    public void depositFunds() {
        float depositAmount = 0;
        System.out.println("Enter deposit amount");
        depositAmount = this.input.nextFloat();
        this.balance += depositAmount;
        System.out.println(depositAmount + " deposited.\nNew Balance: " + this.balance); 
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + this.balance);
    }

    public void finalize() {
        this.input.close();
    }

}