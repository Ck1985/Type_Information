package RTTI_Reflection_Tutorial;

/**
 * Created by anonymous on 10/20/2016.
 */
public class InstanceofTest {
    public static void main(String[] args){
        Shape obj1 = new Shape();
        Shape obj2 = new Circle();

        System.out.println("obj1 is instanceof Shape: " + (obj1 instanceof Shape));
        System.out.println("obj1 is instanceof Circle: " + (obj1 instanceof Circle));
        System.out.println("obj1 is instanceof MyInterface: " + (obj1 instanceof MyInterface));

        System.out.println("obj2 is instanceof Shape: " + (obj2 instanceof Shape));
        System.out.println("obj2 is instanceof Circle: " + (obj2 instanceof Circle));
        System.out.println("obj2 is instanceof MyInterface: " + (obj2 instanceof MyInterface));
    }
}
