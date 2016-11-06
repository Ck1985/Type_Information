package Example.pets;

/**
 * Created by anonymous on 10/29/2016.
 */
import java.util.*;
import typeinfoProject.pets.*;

abstract public class PetCreator {
    private Random random = new Random(47);
    public abstract List<Class<? extends Pet>> getTypes();
    private Pet getRandomPet(){
        Integer n = random.nextInt(getTypes().size());
        try {
            return getTypes().get(n).newInstance();
        }catch(InstantiationException e){
            throw new RuntimeException(e);
        }catch(IllegalAccessException e){
            throw new RuntimeException (e);
        }
    }
    public Pet[] createArrayPet(int n){
        Pet[] arrayPet = new Pet[20];
        for(int i = 0; i < arrayPet.length; i++){
            arrayPet[i] = getRandomPet();
        }
        return arrayPet;
    }
}
