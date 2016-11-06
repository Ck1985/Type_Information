package RTTI_Reflection_Tutorial;
import java.lang.reflect.*;
/**
 * Created by anonymous on 10/21/2016.
 */
class MyFieldClass{
    private static String field1 = "anonymous11100001";
    public int field2 = 15;
}
public class TheReflectionFields {
    public static void main(String[] args){
        try {
            Class objClass = Class.forName("RTTI_Reflection_Tutorial.MyFieldClass");
            Field[] fields = objClass.getFields();
            Class objClass2 = MyFieldClass.class;
            Field field2_2 = objClass2.getField("field2");
            String namefield2 = field2_2.getName();
            System.out.println(namefield2);
            Object typeFiled2 = field2_2.getType();

            Class objClass3 = MyFieldClass.class;
            Field field2_3 = objClass3.getField("field2");
            MyFieldClass myObject = new MyFieldClass();
            Object value = field2_3.get(myObject);
            field2_3.set(myObject, 100);
            System.out.println(myObject.field2);
        }catch(ClassNotFoundException e){

        }catch(NoSuchFieldException e){
            System.out.println("No field such as");
        }catch(IllegalAccessException e){

        }
    }
}
