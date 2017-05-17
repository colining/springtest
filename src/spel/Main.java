package spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/5/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spel.xml");
        Address address = (Address) ctx.getBean("address");
        System.out.println(address);
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
