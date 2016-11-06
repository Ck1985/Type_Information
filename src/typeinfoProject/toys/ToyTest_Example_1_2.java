package typeinfoProject.toys;
import static net.mindview.util.Print.*;
import java.lang.Class;

/**
 * Created by anonymous on 10/20/2016.
 */
interface HasBatteries{}
interface WaterProof{}
interface Shoots{}
interface Move{}

class Toy{
    Toy(){} //This is default Constructor of Toy class
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries, WaterProof, Shoots, Move{
    FancyToy(){
        super(1);
    }
}

public class ToyTest_Example_1_2 {
    static void printInfo(Class cc){
        print("Class name: " + cc.getName() + "\n" + "Is Interface ? " + "[" + cc.isInterface() + "]");
        print("Class SimpleName: " + cc.getSimpleName());
        print("class Cannonical Name: " + cc.getCanonicalName());
    }
    public static void main(String[] args){
        Class c = null;
        try{
            c = Class.forName("typeinfoProject.toys.FancyToy");
        }catch(ClassNotFoundException e){
            print("Couldn't find class");
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces()){
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance(); // Because Toy class has a default constructor, so method newInstance()
            //will be use that constructor to create object has reference (obj) to that toy object
            //Note: class has been created by method instance() has a defalut constructor.
        }catch(InstantiationException e){
            print("Can not instance");
            System.exit(1);
        }catch(IllegalAccessException e){
            print("Can not Access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
