class P {
    int data=100;
    void info(){
        System.out.println("Information From Parent : ");
    }
}
class C extends P {
    
    int data=200;
    
    void info(){
        System.out.println("Information From Child : ");
    }
    
    void print(){
        super.info();
   
        //System.out.println(data);
        //System.out.println(super.data);
    }
}

public class SuperKeywordExample {

    public static void main(String[] args) {
        C ob=new C();
        ob.print();
    }
}
