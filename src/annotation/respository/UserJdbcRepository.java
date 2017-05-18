package annotation.respository;

import org.springframework.stereotype.Repository;

/**
 * Created by asus on 2017/5/18.
 */
@Repository
public class UserJdbcRepository implements UserRepository{
    @Override
    public void save() {
        System.out.println("UserJdbcRepository save");
    }
}
