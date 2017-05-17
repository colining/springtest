package relation;

import auto.Address;
import auto.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/5/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("relation.xml");
        Address address = (Address) ctx.getBean("address1");
        System.out.println(address);
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
