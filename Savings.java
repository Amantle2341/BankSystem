public class Savings extends Account implements PayInterest{
    
    public Savings(int accNumber, String accHolder, int balance, String branch) {
        super(accNumber, accHolder, balance, branch);
    }
    
    @Override
    public void payInterest(double rate){
        this.balance*=rate;
    }
    
}
