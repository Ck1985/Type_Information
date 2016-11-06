package typeinfoProject;

/**
 * Created by anonymous on 10/25/2016.
 */
public class WildcardReference {
    public static void main(String[] args){
        Class<?> intClass = int.class;
        intClass = double.class;

    }
}
