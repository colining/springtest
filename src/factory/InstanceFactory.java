package factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by asus on 2017/5/17.
 */
public class InstanceFactory {
    private Map<String,Car> carMap = null;

    public InstanceFactory(){
        carMap = new HashMap<>();
        carMap.put("audi",new Car("audi",300000));
        carMap.put("ford", new Car("ford", 400000));
    }

    public Car getCar(String brand) {
        return carMap.get(brand);
    }
}
