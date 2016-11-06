/**
 * Created by anonymous on 10/23/2016.
 */
package Example;
import java.net.*;
import java.io.*;
import java.lang.reflect.*;

class Parent_1{
    public static String field_1;
    public int field_2;
    public double field_3;
}
class Parent_2{

}
class Child_1 extends Parent_1{

}
class Child_2 extends Parent_2{

}
class Child_3 extends Parent_1{

}
class Grand_1 extends Child_1{
    public String field_1;
    public long field_2;
}
class Grand_2 extends Child_1{
    public String field_1;
    public String field_2;
}
class Grand_3 extends Child_3{

}
class Grand_4 extends Child_1{
    public String field_1;
    public String field_2;
}
public class Example_8_9 {
    public static Class getClassObject(Object object){
        Class classObj = null;
        classObj = object.getClass();
        return classObj;
    }
    public static void getParentClass(Class classObj){
        Class superClass = classObj.getSuperclass();
        if(superClass.equals(Object.class)){
            return;
        }else{
            System.out.println(superClass.getSimpleName());
            System.out.println(superClass.getSimpleName() + " has fields: ");
            Field[] fields = superClass.getDeclaredFields();
            for(Field field : fields){
                System.out.println(field.getName());
            }
            getParentClass(superClass);
        }
    }
    public static void getSubClass(Object object){
        String namePackage = "Example";
        String nameObjectPkg = new String(namePackage);
        nameObjectPkg = "/" + nameObjectPkg;

        URL url = Example_8_9.class.getResource(nameObjectPkg);
        File directory = new File(url.getFile());
        if(directory.exists()){
            String[] files = directory.list();
            for(String file : files) {
                try {
                    if(file.endsWith(".class")) {
                        file = file.substring(0, file.length() - 6);
                        Class objClass = Class.forName(namePackage + '.' + file);
                        Object objInstance = objClass.newInstance();
                        Class objClassArg = object.getClass();
                        if (objClassArg.isInstance(objInstance)) {
                                System.out.println(objClass.getSimpleName() + " has Fields: ");
                                Field[] fields = objClass.getDeclaredFields();
                                for(Field field : fields){
                                    System.out.println(field.getName());
                                }
                                System.out.println();
                        }
                    }
                }catch(ClassNotFoundException e){
                    System.out.println("Class is not found");
                }catch(InstantiationException e){
                    System.out.println(e);
                }catch(IllegalAccessException e){
                    System.out.println("Class is not public");
                }
            }
        }
    }
    public static void findHierachyObject(Object object){
        System.out.println("All Parent class are: ");
        getParentClass(getClassObject(object));
        System.out.println("All Sub Class are: ");
        getSubClass(object);
    }
    public static void main(String[] args){
        Child_1 child_1 = new Child_1();
        Grand_1 grand_1 = new Grand_1();
        Grand_2 grand_2 = new Grand_2();
        Grand_3 grand_3 = new Grand_3();
        Parent_1 parent_1 = new Parent_1();
        findHierachyObject(child_1);
    }
}
