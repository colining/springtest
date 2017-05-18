package generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/5/18.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("generic.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.add();
    }
}
