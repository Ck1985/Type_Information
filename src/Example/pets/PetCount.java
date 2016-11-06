package Example.pets;

/**
 * Created by anonymous on 10/29/2016.
 */
import java.util.*;
import typeinfoProject.pets.*;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer>{
        public void count(String type){
            Integer quantity = get(type);
            if(quantity == null){
                this.put(type, 1);
            }else{
                this.put(type, quantity + 1);
            }
        }
    }
    public static void countPet(PetCreator creator){
        PetCounter counter = new PetCounter();
        for(Pet pet : creator.createArrayPet(20)){
            System.out.print(pet.getClass().getSimpleName() + " ");
            if(pet instanceof Pet){
                counter.count("Pet");
            }else if(pet instanceof Dog){
                counter.count("Dog");
            }else if(pet instanceof Pug){
                counter.count("Pug");
            }else if(pet instanceof Mutt){
                counter.count("Mutt");
            }else if(pet instanceof Cat){
                counter.count("Cat");
            }else if(pet instanceof Manx){
                counter.count("EgyptianMau");
            }else if(pet instanceof Manx){
                counter.count("Manx");
            }else if(pet instanceof Manx){
                counter.count("Cymric");
            }else if(pet instanceof Rodent){
                counter.count("Rodent");
            }else if(pet instanceof Rat){
                counter.count("Rat");
            }else if(pet instanceof Mouse){
                counter.count("Mouse");
            }else if(pet instanceof Hamster){
                counter.count("Hamster");
            }
        }
        System.out.println();
        System.out.println(counter);
    }
    public static void main(String[] args){
        countPet(new ForNamePet());
    }
}
