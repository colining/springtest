package bean;

/**
 * Created by asus on 2017/5/16.
 */
public class HelloWorld {
    private  String name;

    public HelloWorld(String name) {
        this.name = name;
        System.out.println(name);
    }
    public void hello(){
        System.out.println("hello "+name);
    }
    public void setName(String name) {
        this.name = name;
    }
}
