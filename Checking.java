public class Checking extends Account implements Withdraw{
    
    public Checking(int accNumber, String accHolder, int balance, String branch) {
        super(accNumber, accHolder, balance, branch);
    }

    @Override
    public void withdraw(double amount) {
        this.balance+=amount;
    }
    
}
