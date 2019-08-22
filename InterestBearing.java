public class InterestBearing extends Account implements Withdraw, PayInterest{
    
    public InterestBearing(int accNumber, String accHolder, int balance, String branch) {
        super(accNumber, accHolder, balance, branch);
    }

    @Override
    public void withdraw(double amount) {
        this.balance+=amount;
    }

    @Override
    public void payInterest(double rate) {
        this.balance*=rate;
    }
    
    
}
