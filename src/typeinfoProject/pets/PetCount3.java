package typeinfoProject.pets;

/**
 * Created by anonymous on 11/1/2016.
 */
import java.util.*;
import net.mindview.util.*;
import typeinfoProject.PetCount;

public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }

        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair : this.entrySet()) {
                if (pair.getKey().isInstance(pet)) {
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : this.entrySet()){
                stringBuilder.append(pair.getKey());
                stringBuilder.append(" = ");
                stringBuilder.append(pair.getValue());
                stringBuilder.append(", ");
            }
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }
    public static void main(String[] args){
        PetCounter counter = new PetCounter();
        for(Pet pet : Pets.createArray(20)){
            System.out.print(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}
