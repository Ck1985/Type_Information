package Example.pets;

/**
 * Created by anonymous on 10/29/2016.
 */
import java.util.*;
import typeinfoProject.pets.*;

public class ForNamePet extends PetCreator{
    private static List<Class<? extends Pet>> listPet = new ArrayList<Class<? extends Pet>>();
    private static String[] inputPet = {
            "typeinfoProject.pets.Mutt",
            "typeinfoProject.pets.Pug",
            "typeinfoProject.pets.EgyptianMau",
            "typeinfoProject.pets.Manx",
            "typeinfoProject.pets.Cymric",
            "typeinfoProject.pets.Rat",
            "typeinfoProject.pets.Mouse",
            "typeinfoProject.pets.Hamster"
    };
    @SuppressWarnings("unchecked")
    public static void loader(){
        for(int i = 0; i < inputPet.length; i++){
            try {
                listPet.add((Class<? extends Pet>)Class.forName(inputPet[i]));
            }catch(ClassNotFoundException e){
                throw new RuntimeException(e);
            }
        }
    }
    static{
        loader();
    }
    public List<Class<? extends Pet>> getTypes(){
        return listPet;
    }
}
