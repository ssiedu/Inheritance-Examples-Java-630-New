
public class Cylinder extends Circle {

    private int height;
                    //  10     20
    public Cylinder(int r, int h){
        super(r);
        height=h;
    }
    public void area(){
        double area=3.14*getRadius()*getRadius()*height;
        System.out.println("Area of Cylinder : "+area);
    }
    public static void main(String[] args) {

        Cylinder ob=new Cylinder(10,20);
        ob.area();
        
    }
}
