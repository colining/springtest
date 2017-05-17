package circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/5/17.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("circle.xml");

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        ctx.close();
    }
}
