package annotation;

import annotation.controller.UserController;
import annotation.respository.UserRepositoryImpl;
import annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2017/5/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.xml");
//        TestObject to = (TestObject) ctx.getBean("testObject");
//        System.out.println(to);
//
//        UserController userController = (UserController) ctx.getBean("userController");
//        System.out.println(userController);
//
//        UserService userService = (UserService) ctx.getBean("userService");
//        System.out.println(userService);

        UserRepositoryImpl userRepository = (UserRepositoryImpl) ctx.getBean("userRepository");
        System.out.println(userRepository);
    }
}
