package typeinfoProject.pets;

/**
 * Created by anonymous on 10/31/2016.
 */
import java.util.*;

public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();
    public static Pet randomPet(){
        return creator.randomPet();
    }
    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> createArrayList(int size){
        return creator.createArrayList(size);
    }
}
