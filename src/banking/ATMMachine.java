package banking;

public class ATMMachine {

    public static void printInfo(Card card){
        
        if(card instanceof HDFCCard){
            System.out.println("Its An HDFC Card");
        }else if(card instanceof SBICard){
            System.out.println("Its An SBI Card");
        }else if(card instanceof ICICICard){
            System.out.println("Its An ICICI Card");
        }
        
        /*
        String name=card.getClass().getSimpleName();
        if(name.equals("HDFCCard")){
            System.out.println("Its An HDFC Card");
        }else if(name.equals("SBICard")){
            System.out.println("Its An SBI Card");
        }else if(name.equals("ICICICard")){
            System.out.println("Its An ICICI Card");
        }
        */
        System.out.println("Acc No  : "+card.getAccountNo());
        System.out.println("Balance : "+card.getBalance());
    }
    public static void main(String args[]){
        SBICard sbi=new SBICard("SB1110",10000);
        HDFCCard hdfc=new HDFCCard("HDFC5343",20000);
        ICICICard icici=new ICICICard("IC124323",49000);
        //printInfo(sbi);
        //printInfo(hdfc);
        printInfo(icici);
    }
    
}
