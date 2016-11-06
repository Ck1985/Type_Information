/**
 * Created by anonymous on 10/22/2016.
 */
class Candy{
    static {
        System.out.println("Loading Candy");
    }
}
class Gum{
    static{
        System.out.println("Loading Gum");
    }
}
class Cookie{
    static{
        System.out.println("Loading Cookie");
    }
}
public class Example_7 {
    public static void main(String[] args){
        /*System.out.println("Inside main()");
        new Candy();
        System.out.println("After loading Candy");
        try{
            Class.forName("Gum");
        }catch(ClassNotFoundException e){
            System.out.println("Couldn't found Gum class");
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After loading Cookie()");*/

        if(args.length < 1){
            System.out.println("No arguments Command line");
            System.exit(0);
        }else{
            Class objClass = null;
            try{
                objClass = Class.forName(args[0]);
                System.out.println("Enjoy the object");
            }catch(ClassNotFoundException e){
                System.out.println("We couldn't found the class which you input");
            }
        }
    }
}
