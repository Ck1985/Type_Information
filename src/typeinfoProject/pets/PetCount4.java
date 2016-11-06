package typeinfoProject.pets;

/**
 * Created by anonymous on 11/2/2016.
 */
import java.util.*;

public class PetCount4 {
    public static void main(String[] args){
        TypeCounter counter = new TypeCounter(Pet.class);
        for(Pet pet : Pets.createArray(20)){
            counter.count(pet);
            System.out.print(pet.getClass().getSimpleName() + " ");
        }
        System.out.println();
        System.out.println(counter);
    }
}
