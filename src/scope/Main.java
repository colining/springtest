package scope;

import auto.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/5/17.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("scope.xml");
//        Car car = (Car) ctx.getBean("car");
//        Car car2 = (Car) ctx.getBean("car");
//        System.out.println(car == car2);

    }
}
