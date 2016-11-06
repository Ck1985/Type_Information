package RTTI_Reflection_Tutorial;
import java.lang.reflect.*;

/**
 * Created by anonymous on 10/21/2016.
 */
class MyClass{
    public MyClass(){

    }
    public MyClass(int i){

    }
    public MyClass(int i, int j){

    }
}
public class TheReflectionConstructor {
    public static void main(String[] args){
        try{
            Class objClass = Class.forName("RTTI_Reflection_Tutorial.MyClass");
            Constructor[] constructors = objClass.getConstructors();
            Constructor constructor2 = objClass.getConstructor(new Class[]{Integer.class});
            Constructor constructor3 = objClass.getConstructor(new Class[]{Integer.class, Integer.class});
            Class[] parametters = constructor3.getParameterTypes();
            MyClass myClassObject = (MyClass)constructor3.newInstance(3, 5);
        }catch(ClassNotFoundException e){

        }catch(NoSuchMethodException e){

        }catch(InstantiationException e){

        }catch(IllegalAccessException e){

        }catch(InvocationTargetException e){

        }
    }
}
