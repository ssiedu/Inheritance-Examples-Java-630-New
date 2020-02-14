
public class FinalDemo {

    public void show(final int fp){//read-only parameter
        //fp++;
        System.out.println(fp);
    }

    public static void main(String[] args) {
        FinalDemo ob=new FinalDemo();
        ob.show(50);//ap
    }
}
