package circle;

/**
 * Created by asus on 2017/5/17.
 */
public class Car {
    public Car(){
        System.out.println("car");
    }
    private String brand;

    public void setBrand(String brand) {
        System.out.println("setbrand");
        this.brand = brand;
    }
    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
