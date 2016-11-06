package typeinfoProject.pets;

/**
 * Created by anonymous on 10/26/2016.
 */
public class Individual {
    private String name;
    private static long count = 0;
    private final long id = count++;
    public Individual(){

    }
    public Individual(String name){
        this.name = name;
    }
    public String toString(){
        return this.name = "Simple name";
    }
}
