package typeinfoProject;
/**
 * Created by anonymous on 10/20/2016.
 */
class Candy{
    static { System.out.println("Loading Candy");}
}
class Gum{
    static {System.out.println("Loading Gum");}
}
class Cookie{
    static {System.out.println("Loading Cookie");}
}
public class SweetShop {
    public static void main(String[] args){
        System.out.println("Inside main()");
        new Candy();
        System.out.println("After creating Candy");
        try{
            Class.forName("typeinfoProject.Gum");
        }catch(ClassNotFoundException e){
            System.out.println("Not found Gum class");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After Creating Cookie");
    }
}
