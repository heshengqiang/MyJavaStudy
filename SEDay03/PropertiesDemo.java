package SEDay03;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    /* Properties属性集，100%会用到
     Class properties extends HashTable implements Map,Properties是一个持久的属性集
     它具有自己写数据到文件中的方法，没有泛型固定是 Properties<String String>
     Properties方法：
     getProperties(String key);//通过键获取属性值，对应Map的get方法
     setProperties(String key,String value)//添加键值对，跟Map的put方法一样
     Set<String> StringPropertyNames//获取键的集合，跟keySet方法一样
     */
    @Test
    public void PropertiesDemo1() {
        Properties properties = new Properties();
        //添加属性
        properties.setProperty("jdbc.Driver", "com.mysql.jdbc.Driver");
        properties.setProperty("jdbc.url", "jdbc:mysql://127.0.0.1:3306/teaching?useUnicode=true&amp;characterEncoding=utf-8");
        properties.setProperty("jdbc.username", "root");
        properties.setProperty("jdbc.password", "123456");
        //遍历属性stringPropertyNames对应keySet
        Set<String> key = properties.stringPropertyNames();
        for (String keys : key) {
            System.out.println(keys + "=" + properties.getProperty(keys));
        }
    }

    @Test
    public void PropertiesDemo2() throws Exception {
        Properties properties = new Properties();
        //添加属性
        properties.setProperty("jdbc.Driver", "com.mysql.jdbc.Driver");
        properties.setProperty("jdbc.url", "jdbc:mysql://127.0.0.1:3306/teaching?useUnicode=true&amp;characterEncoding=utf-8");
        properties.setProperty("jdbc.username", "root");
        properties.setProperty("jdbc.password", "123456");
        //将properties的数据写到文件中
        properties.store(new FileWriter("src/SEDay03/Jdbc/Jdbc.properties"), "Jason he");
        System.out.println(properties);
    }

    @Test
    public void PropertiesDemo3() throws Exception {
        Properties properties = new Properties();
        //读取属性文件
        properties.load(new FileReader("src/SEDay03/Jdbc/Jdbc.properties"));
        System.out.println(properties);
    }
}
