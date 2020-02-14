
public class SavingAccount extends Account {
    
    private String nominee;

    public String getNominee() {
        return nominee;
    }

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }
    
    
    public String toString(){
        String res=getAno()+","+getCname()+","+getBalance()+","+getAtype()+","+nominee;
        return res;
    }
}
