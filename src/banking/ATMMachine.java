package banking;

public class ATMMachine {

    public static void printInfo(Card card){
        System.out.println("Acc No  : "+card.getAccountNo());
        System.out.println("Balance : "+card.getBalance());
    }
    public static void main(String args[]){
        SBICard sbi=new SBICard("SB1110",10000);
        HDFCCard hdfc=new HDFCCard("HDFC5343",20000);
        ICICICard icici=new ICICICard("IC124323",49000);
        printInfo(sbi);
        printInfo(hdfc);
        printInfo(icici);
    }
    
}
