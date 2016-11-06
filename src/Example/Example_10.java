package Example;

/**
 * Created by anonymous on 10/25/2016.
 */
public class Example_10 {
    public static void main(String[] args){
        char[] arrayChar = new char[10];
        System.out.println(arrayChar.getClass().getSuperclass());
        System.out.println("array is a Class object: " + Object.class.isInstance(arrayChar));
        System.out.println("arrayChar is instance of Object: " + arrayChar instanceof Object);
    }
}
