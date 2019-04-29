package SEDay01;
//1.当子类继承泛型接口的时候确定类型
public class userDaoImp implements userDao<String> {

    public void showUser(String name) {
        System.out.println(name);
    }
}
