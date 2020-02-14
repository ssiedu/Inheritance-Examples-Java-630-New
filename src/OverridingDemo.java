class A{
    void display(){
        System.out.println("Display of A");
    }
}
class B extends A{
    //child has overloaded display method of parent
    void  display(){
        System.out.println("Display of B");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        B ob=new B();
        ob.display();
    }
}
