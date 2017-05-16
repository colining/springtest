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
        helloWorld.hello();
    }
}
