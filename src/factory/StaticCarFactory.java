package factory;

import circle.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by asus on 2017/5/17.
 */
public class StaticCarFactory {
    private static Map<String ,Car> carMap = new HashMap<>();
    static {
        carMap.put("audi", new Car("audi", 30000000));
        carMap.put("ford", new Car("ford", 40000000));

    }
    public static Car getCar(String name) {
        return  carMap.get(name);
    }
}
