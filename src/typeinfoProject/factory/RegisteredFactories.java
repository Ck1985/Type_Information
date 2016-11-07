package typeinfoProject.factory;

/**
 * Created by anonymous on 11/7/2016.
 */
import java.util.*;

class Part{
    public String toString(){
        return this.getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();

}
class Filter extends Part{}
class AirFilter extends Filter{}
class FuelFilter extends Filter{}
class CabinAirFilter extends Filter{}
class OilFilter extends Filter{}
class Belt extends Part{}
class FanBelt extends Belt{}
class GeneratorBelt extends Belt{}
class PowerSteeringBelt extends Belt{}
public class RegisteredFactories {
}
