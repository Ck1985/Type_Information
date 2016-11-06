package RTTI_Reflection_Tutorial;
import java.util.*;

/**
 * Created by anonymous on 10/20/2016.
 */
interface MyInterface{

}
class Shape{
    public void draw(){
        System.out.println(this + ".draw()");
    }
}
class Circle extends Shape implements MyInterface{
    public String toString(){
        return "Circle";
    }
}
class Square extends Shape{
    public String toString(){
        return "Square";
    }
}
class Triangle extends Shape{
    public String toString(){
        return "Triangle";
    }
}
public class Shapes {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Circle());
        arrayList.add(new Square());
        arrayList.add(new Triangle());

        Iterator e = arrayList.iterator();
        while(e.hasNext()){
            ((Shape)e.next()).draw();
        }
    }
}
