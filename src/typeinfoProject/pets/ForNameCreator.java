package typeinfoProject.pets;
import java.util.*;

/**
 * Created by anonymous on 10/26/2016.
 */
public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typesName =
            {
                "typeinfoProject.pets.Mutt",
                    "typeinfoProject.pets.Pug",
                    "typeinfoProject.pets.EgyptianMau",
                    "typeinfoProject.pets.Manx",
                    "typeinfoProject.pets.Cymric",
                    "typeinfoProject.pets.Rat",
                    "typeinfoProject.pets.Mouse",
                    "typeinfoProject.pets.Hamster",
                    "typeinfoProject.pets.Gerbil"
            };
            @SuppressWarnings("unchecked")
    private static void loader(){
        try{
            for(String name : typesName) {
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        }
        static{
            loader();
        }
    public List<Class<? extends Pet>> types(){
        return types;
    }
}
