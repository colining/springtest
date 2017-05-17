package bean;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/5/16.
 */
public class Main {
    public static void main(String[] args) {
//        HelloWorld helloWorld =new HelloWorld("colin");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("HelloWorld");
        HelloWorld helloWorld1 = (HelloWorld) ctx.getBean("He");
        helloWorld.hello();
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        Car car1 = (Car) ctx.getBean("car1");
        System.out.println(car1);
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
