package annotation.respository;

import annotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by asus on 2017/5/17.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired(required = false)
    private TestObject testObject;
    @Override
    public void save() {
        System.out.println("save");
        System.out.println(testObject);
    }
}
