package typeinfoProject;
import java.util.*;
/**
 * Created by anonymous on 10/25/2016.
 */
class Initable_1{
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.random.nextInt(100);
    static {
        System.out.println("Initializing Initable_1");
    }
}
class Initable_2{
    static int staticNonFinal = 147;
    static{
        System.out.println("Initializing Initable_2");
    }
}
class Initable_3{
    static int staticNonFinal = 74;
    static{
        System.out.println("Initializing Initable_3");
    }
}
public class ClassInitialization {
    public static Random random = new Random(47);
    public static void main(String[] args){
        Class initable_1 = Initable_1.class;
        System.out.println("After create Initable_1 reference");
        //Does not trigger initialization
        System.out.println(Initable_1.staticFinal);
        //Does trigger Initialization
        System.out.println(Initable_1.staticFinal2);
        //Does trigger initialization
        System.out.println(Initable_2.staticNonFinal);
        try {
            Class initable_3 = Class.forName("typeinfoProject.Initable_3");
        }catch(ClassNotFoundException e){

        }
        System.out.println("After create Initable_3 reference");
        System.out.println(Initable_3.staticNonFinal);
    }
}
