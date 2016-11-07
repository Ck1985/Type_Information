package typeinfoProject.coffee;

/**
 * Created by anonymous on 11/5/2016.
 */
import java.util.*;
import java.lang.*;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private static Random random = new Random(47);
    private Class[] types = {Latte.class, Mocha.class, Cappucino.class, Americano.class, Breve.class};
    public CoffeeGenerator(){}
    private int size = 0;
    public CoffeeGenerator(int size){
        this.size = size;
    }
    public Coffee next(){
        try{
            return (Coffee)types[random.nextInt(types.length)].newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;
        public boolean hasNext(){
            return this.count > 0;
        }
        public Coffee next(){
            this.count--;
            return CoffeeGenerator.this.next();
        }
        public void remove(){
            throw new UnsupportedOperationException();
        }
    }
    public Iterator<Coffee> iterator(){
        return new CoffeeIterator();
    }
    public static void main(String[] args){
        CoffeeGenerator generator = new CoffeeGenerator();
        for(int i = 0; i < 5; i++){
            System.out.println(generator.next());
        }
    }
}
