package typeinfoProject.coffee;

/**
 * Created by anonymous on 11/5/2016.
 */
public class Coffee {
    private static long count;
    private final long id = count++;
    public String toString(){
        return this.getClass().getSimpleName() + " " + this.id;
    }
}
