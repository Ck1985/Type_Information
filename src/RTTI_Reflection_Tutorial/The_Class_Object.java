package RTTI_Reflection_Tutorial;
import java.lang.Class;
import java.lang.reflect.Constructor;
/**
 * Created by anonymous on 10/21/2016.
 */
class MyObject{
    public String toString(){
        return "BaseClass";
    }
}
class MyObject2{

}
abstract class Class3 extends MyObject{
    public Class3(){}
    public Class3(int i){

    }
}
public class The_Class_Object {
    public static void main(String[] args){
        Class myClassObject = MyObject.class;
        String className = "RTTI_Reflection_Tutorial.MyObject2";
        try{
            Class cc = Class.forName(className);
            String getClassName = cc.getName();
            System.out.println(getClassName + "\n" + cc.getSimpleName());
            Class cc3 = Class.forName("RTTI_Reflection_Tutorial.Class3");
            int modifier3 = cc3.getModifiers();
            System.out.println(modifier3);
            System.out.println(cc3.getSuperclass());
            Constructor constructors = cc3.getConstructor();
        }catch(ClassNotFoundException e){
            System.out.println("Couldn't found class");
        }catch(NoSuchMethodException e){

        }
    }
}
