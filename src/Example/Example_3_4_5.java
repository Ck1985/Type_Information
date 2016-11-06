import java.util.*;

/**
 * Created by anonymous on 10/22/2016.
 */
abstract class Shape{
    public void draw() {
        System.out.println(this + ".draw()");
    }
    public void rotate(Shape shape){
        if(shape instanceof Circle){
            System.out.println("It is Circle type, so we don't implement operator");
            //System.exit(0);
        }else{
            System.out.println("Type is referen to: " + this +".rotate()");
        }
    }
    public abstract String toString();
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
class Triangle extends Shape{
    public String toString(){
        return "Triangle";
    }
}
class Rhomboid extends Shape{
    public String toString(){
        return "Rhomboid";
    }
}
public class Example_3_4_5 {
    public static void main(String[] args){
        //Upcasting to Shape type
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());
        /*for(Shape shape : shapes){
            //DownCasting to specific type
            shape.draw();
        }
        Rhomboid rhomboid = new Rhomboid();
        Circle circle = new Circle();
        //Inconvertable to Circle
        //(Circle)rhomboid
        //Upcasting to shape
        Shape shapeR = (Shape)rhomboid;
        Shape shape = (Shape)circle;
        //Use operator instanceof to check before downcasting
        if(shape instanceof Circle){
            //downcasting to Circle
            ((Circle)shape).draw();
        }else{
            System.out.println("shape is not Circle");
        }*/
        for(Shape shape : shapes){
            shape.rotate(shape);
        }
    }
}
