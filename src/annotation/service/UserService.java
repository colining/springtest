package annotation.service;

import annotation.respository.UserRepository;
import annotation.respository.UserRepositoryImpl;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by asus on 2017/5/17.
 */
@Service

public class UserService {
    private UserRepository userRepository;
    @Autowired()
    @Qualifier("userRepositoryImpl")
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void  add(){
        System.out.println("UserService add....");
        userRepository.save();
    }
}
