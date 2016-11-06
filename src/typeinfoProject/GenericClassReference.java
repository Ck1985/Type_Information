package typeinfoProject;

/**
 * Created by anonymous on 10/25/2016.
 */
public class GenericClassReference {
    public static void main(String[] args){
        Class intClass = int.class;
        Class<Integer> IntegerClass = Integer.class;
        IntegerClass = int.class;
        intClass = double.class;
        //IntegerClass = double.class;
    }
}
