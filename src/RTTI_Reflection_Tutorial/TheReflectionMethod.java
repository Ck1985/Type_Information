package RTTI_Reflection_Tutorial;
import java.lang.reflect.*;
/**
 * Created by anonymous on 10/21/2016.
 */
class MyClassMethod{
    public static void doSomething(String parameterString){

    }
    public void doSomething2(){}
}
public class TheReflectionMethod {
    public static void main(String[] args){
        try {
            Class objClass = MyClassMethod.class;
            Method[] methods = objClass.getMethods();
            Method method1 = objClass.getMethod("doSomething", new Class[]{String.class});
            Method method2 = objClass.getMethod("doSomething2", null);
            Class returnType = method2.getReturnType();
            Class[] parameterType = method1.getParameterTypes();
            Object returnvalue = method2.invoke(new MyClassMethod(), null);
            Object returnValue2 = method1.invoke(null, "anonymous11100001");
        }catch(NoSuchMethodException e){

        }catch(IllegalAccessException e){

        }catch(InvocationTargetException e){

        }
    }
}
