import java.util.*;

public class Account {
    int accountNo = 0;
    float balance = 0;

    public void createAccount() {
        System.out.println("Enter your account no");
        Scanner input = new Scanner(System.in);
        this.accountNo = input.nextInt();
        System.out.println("Account No: " + this.accountNo + " created");
        input.close();
    }
}