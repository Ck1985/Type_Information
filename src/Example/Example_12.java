package Example;

/**
 * Created by anonymous on 11/7/2016.
 */
import java.util.*;
import typeinfoProject.coffee.*;
import typeinfoProject.pets.TypeCounter;

public class Example_12 {
    public static void main(String[] args){
        TypeCounter counter = new TypeCounter(Coffee.class);
        CoffeeGenerator generator = new CoffeeGenerator();
        Coffee coffee = null;
        for(int i = 1; i < 10; i++){
            coffee = generator.next();
            counter.count(coffee);
        }
        System.out.println(counter);
    }
}
