public class CurrentAccount extends Account {
        private String firm;

    public void interest(){
        System.out.println("Interest : "+(getBalance()*6/100));
    }
        
    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
}
