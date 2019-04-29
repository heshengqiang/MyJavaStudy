package SEDay01;

import org.junit.Test;
import sun.management.resources.agent;

import java.util.ArrayList;
import java.util.Collection;

public class GeneicDemo {
    //泛型<E><E,V><Q,E,F>...字母不规定，一般为E表示：理解不确定的类型
    //好处：将运行时期异常变为编译时期异常，还可以避免强转哦等其他好处哈哈
    //E e 其实e是用来保存一种数据类型，就是一个变量，理解为可以接受一种数据类型很强大吧！
    @Test
    public void GeneicDemo1(){
        //拿集合举例
        ArrayList<String> list1=new ArrayList<>();
        ArrayList list2=new ArrayList();
        //list1只能添加String类型元素
        list1.add("dsfds");
        //list2可以添加任意类型，这样其实是很不好的容易需要强转等问题
        list2.add("dfsjf");
        list2.add(213);
        list2.add(new agent());

    }
    //泛型用在类上 格式：[访问修饰符] class 类名<E> 首先E代表不确定的类型，
    // 但是当实例化这个类时,E的类型就需要被确定下来。
    @Test
    public void GeneicDemo2(){
        //我们先创建一个泛型类user public class user<E>路径为(SEDay01.user)
        user<String> user1=new user<String>();//当你实例化类时确定E的类型，这里E为String
        user1.setUser_num("100002848232129");
        user<Integer> user2=new user<Integer>();//当你实例化类时确定E的类型，这里E为Integer
        user2.setUser_num(100230);

    }
    //泛型用在方法上
    @Test
    public void GeneicDemo3(){
        //我先在user类中创建一个泛型方法 public<E> void showUser(E user_id)
        user<Integer> user=new user<Integer>();
        //我给方法传一个int 类型的参数，即E为int类型
        int user_id1=100;
        user.showUser(user_id1);
        //我给方法传一个String 类型的参数，即E为String类型
        String user_id2="中国万岁";
        user.showUser(user_id2);
        //相信这里就可以进一步了解泛型的好处了吧！
    }
    //泛型用在接口上
    @Test
    public void GeneicDemo4(){
        //我先创建一个泛型接口 public interface userDao<E>路径为：SEDay01.userDao
        //在创建类userDaoImp public class userDaoImp implements userDao<String>继承该接口
        // 路径为：SEDay01.userDaoImp,这里在继承接口时确定了类型
        userDao userDao=new userDaoImp();
        userDao.showUser("小明");
        //还有一种是在继承泛型接口的时候继续保持泛型实现下来，具体可以这样
        //这样需要创建实现类对象的时候才确定类型，这里就不再包下创建了，代码如下
         /*public class userDaoImp<E> implements userDao<E>{
           public void showUser(E name) {
                                  System.out.println(name);
                                         }
          }
          */
    }
    /*
    * 泛型通配符：(了解)
    * ?:代表任意类型
    * <? extends user> 表示一种泛型,这种泛型必须是user类或者user类的子类
    * 用集合中的addAll()方法举例说明
    * */
    @Test
    public void GeneicDemo5(){
        //集合name1
        ArrayList<String> name1=new ArrayList<>();
        name1.add("111");
        name1.add("222");
        name1.add("333");
        name1.add("444");
        //集合name2
        ArrayList<String> name2=new ArrayList<>();
        name2.add("aaa");
        name2.add("bbb");
        name2.add("ccc");
        name2.add("ddd");
        //需求将集合name2中元素加到name1中,实现如下:
        name1.addAll(name2);//这里的addAll方法 Collection(? extends String)就用到通配符
        System.out.println(name1);

    }
}