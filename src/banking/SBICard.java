package banking;

public class SBICard implements Card {
    private String accountNo;
    private double balance;

    public SBICard(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    
    @Override
    public String getAccountNo() {
        return accountNo;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
