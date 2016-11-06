import java.util.List;
import java.util.Arrays;
/**
 * Created by anonymous on 10/22/2016.
 */
abstract class Shape6{
    public void draw(){
        System.out.println(this + ".draw()");
    }
    public abstract String toString();
}
class Circle6 extends Shape6{
    boolean flag = false;
    public String toString(){
        return (flag ? "H" : "UnH") + "ighlighted " + "Circle";
    }
}
class Triangle6 extends Shape6{
    boolean flag = false;
    public String toString(){
        return (flag ? "H" : "UnH") + "ighlighted " + "Triangle";
    }
}
class Square6 extends Shape6{
    boolean flag = false;
    public String toString(){
        return (flag ? "H" : "UnH") + "ighlighted " + "Square";
    }
}
class Rhomboid6 extends Shape6{
    boolean flag = false;
    public String toString(){
        return (flag ? "H" : "UnH") + "ighlighted " + "Rhomboid";
    }
}
public class Example_6 {
    private static void setFlag(Shape6 shape){
        if((shape instanceof Square6)){
            ((Square6)shape).flag = true;
        }else if ((shape instanceof Rhomboid6)){
            ((Rhomboid6)shape).flag = true;
        }
    }
    public static void main(String[] args){
        List<Shape6> shapes = Arrays.asList(new Circle6(), new Square6(), new Triangle6(), new Rhomboid6());
        for(Shape6 shape : shapes){
            setFlag(shape);
            shape.draw();
        }
    }
}
