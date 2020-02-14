
public class Bank {

    public static void main(String[] args) {
        SavingAccount ac1=new SavingAccount();
        ac1.setAno(111);
        ac1.setCname("AAA");
        ac1.setBalance(10000);
        ac1.setAtype("Saving");
        ac1.setNominee("Xyz");
        System.out.println(ac1);
        /*
        System.out.println(ac1.getAno());
        System.out.println(ac1.getCname());
        System.out.println(ac1.getBalance());
        System.out.println(ac1.getAtype());
        System.out.println(ac1.getNominee());     
        ac1.interest();
        System.out.println("_______________________________");
        CurrentAccount ac2=new CurrentAccount();
        ac2.setAno(112);
        ac2.setCname("BBB");
        ac2.setBalance(20000);
        ac2.setAtype("Current");
        ac2.setFirm("Xyz Ltd.");
        System.out.println(ac2.getAno());
        System.out.println(ac2.getCname());
        System.out.println(ac2.getBalance());
        System.out.println(ac2.getAtype());
        System.out.println(ac2.getFirm());     
        ac2.interest();
        System.out.println("____________________________");
        String info=ac1.toString();
        System.out.println(info);
        */
    }
}
