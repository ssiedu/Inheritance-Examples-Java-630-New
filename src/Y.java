
public class Y extends X {

    public Y(){
        super(1,2);  
        System.out.println("Y-0");
    }
    public Y(int i){
        super(5,6);
        System.out.println("Y-1");
    }
    public Y(int i, int j){
        super(5);
        System.out.println("Y-2");
    }
    public Y(int i, int j, int k){
        System.out.println("Y-3");
    }
    public static void main(String[] args) {
        Y ob=new Y(1,2,3);
    }
}
