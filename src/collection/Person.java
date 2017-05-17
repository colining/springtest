package collection;

import bean.Car;

import java.util.List;

/**
 * Created by asus on 2017/5/17.
 */
public class Person {
    private String name;
    private List<Car> cars;
    private int age;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCar() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }


    public Person(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}
