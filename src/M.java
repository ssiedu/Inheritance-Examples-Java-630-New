public abstract class M {
    //concrete methods (with body)
    void f1(){System.out.println("f1 from M");}
    void f2(){System.out.println("f2 from M");}
    //abstract methods (without body)
    abstract void f3();
    abstract void f4();
}
//only  non-static methods can be marked abstract
//static methods can't be marked as abstract