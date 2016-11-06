package typeinfoProject;
import java.util.*;
/**
 * Created by anonymous on 10/19/2016.
 */
abstract class Shape{
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}
class Circle extends Shape{
    public String toString(){
        return "Circle";
    }
}
class Square extends Shape{
    public String toString(){
        return "Square";
    }
}
class Triangle extends Shape {
    public String toString(){
        return "Triangle";
    }
}
public class Shapes {
    public static void main(String[] args){
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
        for(Shape shape : shapes){
            shape.draw();
        }
    }
}
