public class Account {
    private int ano;
    private String cname;
    private int balance;
    private String atype;

    public void interest(){
        System.out.println("Interest : "+(balance*10/100));
    }
    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public String toString(){
        String res=ano+","+cname+","+balance+","+atype;
        return res;
    }
    
}
