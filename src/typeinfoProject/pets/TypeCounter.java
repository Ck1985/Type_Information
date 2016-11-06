package typeinfoProject.pets;

/**
 * Created by anonymous on 11/2/2016.
 */
import java.util.*;

public class TypeCounter extends HashMap<Class<?>, Integer>{
    private Class<?> baseType;
    public TypeCounter(Class<?> baseType){
        this.baseType = baseType;
    }
    public void count(Object object){
        Class<?> type = object.getClass();
        if(!this.baseType.isAssignableFrom(type)){
            throw new RuntimeException(object + " incorrect type: " + type + " it shoud be type or subType of: " + this.baseType);
        }
        countClass(type);
    }
    private void countClass(Class<?> type){
        Integer quantity = this.get(type);
        this.put(type, quantity == null ? 1 : quantity + 1);
        Class<?> superClass = type.getSuperclass();
        if(superClass != null && this.baseType.isAssignableFrom(superClass)){
            countClass(superClass);
        }
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for(Map.Entry<Class<?>, Integer> entry : this.entrySet()){
            stringBuilder.append(entry.getKey().getSimpleName() + " ");
            stringBuilder.append(" = ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
