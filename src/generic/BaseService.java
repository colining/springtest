package generic;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by asus on 2017/5/18.
 */
public class BaseService<T> {

    @Autowired
    protected  BaseRepository<T> repository;

    public void add(){
        System.out.println("add");
        System.out.println(repository);
    }
}
