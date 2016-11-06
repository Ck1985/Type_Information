package RTTI_Reflection_Tutorial;
import java.net.*;
import java.io.*;
/**
 * Created by anonymous on 10/23/2016.
 */
class LightOn implements Command{
    public void process(){
        System.out.println("Process LightOn");
    }
}
class LightOff implements Command{
    public void process(){
        System.out.println("Process LightOff");
    }
}
class DoorOpen implements Command{
    public void process(){
        System.out.println("Process DoorOpen");
    }
}
class DoorClose implements Command{
    public void process(){
        System.out.println("Process DoorClose");
    }
}
class DoorLock implements Command{
    public void process(){
        System.out.println("DoorLock");
    }
}
public class Launcher {
    public static void find(String packageName){
        String namePackage = new String(packageName);
        if(!(namePackage.startsWith("/"))){
            namePackage = "/" + namePackage;
        }
        namePackage.replace('.', '/');

        URL url = Launcher.class.getResource(namePackage);
        File directory = new File(url.getFile());
        if(directory.exists()){
            String[] files = directory.list();
            for(String file : files){
                if(file.endsWith(".class")){
                    file = file.substring(0, file.length() - 6);
                    try{
                        Class objClass = Class.forName(packageName + '.' + file);
                        Object obj = objClass.newInstance();
                        if(obj instanceof Command){
                            System.out.println(file);
                        }
                    }catch(ClassNotFoundException e){
                        System.out.println(e);
                    }catch(InstantiationException e){

                    }catch(IllegalAccessException e){
                        System.out.println("Class is not public");
                    }
                }
            }
        }else{
            System.out.println("Sorry! no directory coresspon to this abstract pathName");
        }
    }
    public static void main(String[] args){
        /*if(args.length > 0){
            try{
                Command command = (Command)(Class.forName("RTTI_Reflection_Tutorial." + args[0]).newInstance());
                command.process();
            }catch(Exception e){
                System.out.println("Invalid command");
                System.out.println("Available commands:");*/
                find("RTTI_Reflection_Tutorial");
            /*}
        }else{
            System.out.println("Usage: <command>");
            System.exit(0);
        }*/
    }
}
