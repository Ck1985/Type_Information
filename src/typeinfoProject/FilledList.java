package typeinfoProject;
import java.util.*;

/**
 * Created by anonymous on 10/25/2016.
 */
class CounterClass{
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return Long.toString(id);
    }
}
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }
    public List<T> create(int nElements){
        List<T> list = new ArrayList<T>();
        try {
            for (int i = 0; i < nElements; i++) {
                list.add(type.newInstance());
            }
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        FilledList<CounterClass> filledList = new FilledList<CounterClass>(CounterClass.class);
        System.out.println(filledList.create(15));
    }
}
