package bean;

/**
 * Created by asus on 2017/5/17.
 */
public class Car {
    private  String brand;
    private  String corp;

    private  double price;

    private  int maxSpeed;
    public void setPrice(double price) {
        this.price = price;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



    public Car(String brand, String corp, int maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, String corp, double price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "bean.Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
