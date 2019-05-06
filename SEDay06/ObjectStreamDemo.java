package SEDay06;

import org.junit.Test;

import java.io.*;

public class ObjectStreamDemo {
    /*
    * 序列化流：
    * 写对象到文件
    * 反序列化流：
    * 从文件中读取对象
    *
    * */
    @Test
    public void ObjectOutputStreamDemo() throws IOException, ClassNotFoundException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("person.java"));
        //person per=new person("老毕",19);
       //transient关键字在序列化的时候有用，被它修饰的成员变量在反序列化的时候该成员变量属性不会显示出来
        //这里定义的transientPerson类中的age变量被transient修饰了
        transientPerson transientPerson=new transientPerson("王类",19);
        //使用这个的测试结果为：transientPerson{name='王类', age=0}，看到age值被隐藏起来了
        oos.writeObject(transientPerson);//序列化，将对象写到文件,如果pojo类没有实现这个接口Serializable
        //就会抛出一个异常NotSerializableException，这个接口相当于一个标记。
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("person.java"));
        Object object = ois.readObject();//反序列化流,将文件对象读取出来
        System.out.println(object.toString());
        oos.close();
        ois.close();
    }

}
