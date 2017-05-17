package factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/5/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("factory.xml");
//        Car car = (Car) ctx.getBean("car1");
//        System.out.println(car);
        BeanFactory beanFactory = (BeanFactory) ctx;
        Car car = (Car) beanFactory.getBean("audi");
        System.out.println(car);
    }
}
