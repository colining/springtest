package annotation.controller;

import annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by asus on 2017/5/17.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void execute(){
        System.out.println("usercontroller execute");
        userService.add();
    }
}
