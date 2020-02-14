package banking;

public class HDFCCard implements Card {

    private String accountNo;
    private double balance;

    public HDFCCard(String accountNo, double balance) {
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
