
public class Saving_Bank_Account extends Account {

    private float annualRate = 0.001f;

    public void compoundMonthly() {
        float interest = balance * (annualRate/12);
        this.balance += interest;
    }
    
}
