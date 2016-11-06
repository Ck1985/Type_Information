package Reflection_API_Oracle.Classes;
import static net.mindview.util.Print.*;
/**
 * Created by anonymous on 10/23/2016.
 */
interface MyInterface{}
class Parent{}
class Child extends Parent implements MyInterface{

}
public class InstanceofDemo {
    public static void main(String[] args){
        Parent parentobj = new Parent();
        Child childobj = new Child();
        print("parentobj is instanceof Parent: " + (parentobj instanceof Parent));
        print("parentobj is instanceof Child: " + (parentobj instanceof Child));
        print("parentobj is instanceof MyInterface: " + (parentobj instanceof MyInterface));
        print("childobj is instanceof Parent: " + (childobj instanceof Parent));
        print("childobj is instanceof Child: " + (childobj instanceof Child));
        print("childobj is instanceof MyInterface: " + (childobj instanceof MyInterface));
    }
}
