package typeinfoProject;

/**
 * Created by anonymous on 10/26/2016.
 */
class Building{

}
class House extends Building{

}
public class ClassCast {
    public static void main(String[] args){
        Building b = new Building();
        // House h = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House)b;
    }
}
