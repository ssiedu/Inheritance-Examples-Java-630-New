package banking;

public class ICICICard implements Card {

    private String accountNo;
    private double balance;

    public ICICICard(String accountNo, double balance) {
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
