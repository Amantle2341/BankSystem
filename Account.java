public class Account {
    private int accNumber;
    private String accHolder;
    double balance;
    private String branch;

    public Account(int accNumber, String accHolder, double balance, String branch) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.balance = balance;
        this.branch = branch;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    public void deposit(double amount){
        this.balance = amount + balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accNumber=" + accNumber + ", accHolder=" + accHolder + ", balance=" + balance + ", branch=" + branch + "]";
    }
    
}
