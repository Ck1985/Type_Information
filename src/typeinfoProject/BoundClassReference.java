package typeinfoProject;

/**
 * Created by anonymous on 10/25/2016.
 */
public class BoundClassReference {
    public static void main(String[] args){
        Class<? extends Number> boundClass = int.class;
        boundClass = Number.class;
        boundClass = double.class;
    }
}
