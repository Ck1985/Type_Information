package typeinfoProject.factory;

/**
 * Created by anonymous on 11/7/2016.
 */
import typeinfoProject.coffee.Generator;

import java.util.*;

class Part{
    public String toString(){
        return this.getClass().getSimpleName();
    }
    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
    static{
        partFactories.add(new AirFilter.Factory());
        partFactories.add(new FuelFilter.Factory());
        partFactories.add(new CabinAirFilter.Factory());
        partFactories.add(new OilFilter.Factory());
        partFactories.add(new FanBelt.Factory());
        partFactories.add(new PowerSteeringBelt.Factory());
        partFactories.add(new GeneratorBelt.Factory());
    }
    private static Random random = new Random(47);
    public static Part createRandom(){
        Integer n = random.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}
class Filter extends Part{}
class AirFilter extends Filter{
    public static class Factory implements typeinfoProject.factory.Factory<AirFilter>{
        public AirFilter create(){
            return new AirFilter();
        }
    }
}
class FuelFilter extends Filter{
    public static class Factory implements typeinfoProject.factory.Factory{
        public FuelFilter create(){
            return new FuelFilter();
        }
    }
}
class CabinAirFilter extends Filter{
    public static class Factory implements typeinfoProject.factory.Factory{
        public CabinAirFilter create(){
            return new CabinAirFilter();
        }
    }
}
class OilFilter extends Filter{
    public static class Factory implements typeinfoProject.factory.Factory{
        public OilFilter create(){
            return new OilFilter();
        }
    }
}
class Belt extends Part{}
class FanBelt extends Belt{
    public static class Factory implements typeinfoProject.factory.Factory{
        public FanBelt create(){
            return new FanBelt();
        }
    }
}
class GeneratorBelt extends Belt{
    public static class Factory implements typeinfoProject.factory.Factory{
        public GeneratorBelt create(){
            return new GeneratorBelt();
        }
    }
}
class PowerSteeringBelt extends Belt{
    public static class Factory implements typeinfoProject.factory.Factory{
        public PowerSteeringBelt create(){
            return new PowerSteeringBelt();
        }
    }
}
public class RegisteredFactories {
}
