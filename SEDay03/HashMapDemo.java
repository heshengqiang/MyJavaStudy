package SEDay03;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    /*Map集合常用方法：
    * 增：V put(K key,V value);//向集合中添加以键值对形式的元素，如果添加时集合中已经存在了
    * 相同的键，则覆盖原来的键值对，并且返回原来的值。
    * 删：V remove(Object key);//根据键删除集合中的键值对，返回值为被删除的值。
    * 查：V get(K key);//根据键从集合中找到唯一的键对应的值。
    *
    * */
    @Test
    public void HashMapDemo1(){
        //创建HashMap集合
        Map<Integer,String> map=new HashMap<>();
        //添加
        map.put(1,"中国");
        map.put(2,"美国");
        map.put(3,"日本");
        map.put(4,"韩国");
        String put = map.put(1, "中华人民共和国");//这里会覆盖之前的值，返回被覆盖的键值对的值。
        System.out.println(map);
        //删除
        String remove = map.remove(3);
        System.out.println(remove);//返回被删值
        System.out.println(map);
        //查询
        String s = map.get(2);
        System.out.println(s);
    }
    @Test
    public void HashMapDemo2(){
        //Map集合的遍历方式1：键找值(因为map不是继承Collection集合没有迭代器)
        //keySet()可以获取所有键的集合
        //创建HashMap集合
        Map<Integer,String> map=new HashMap<>();
        //添加
        map.put(1,"中国");
        map.put(2,"美国");
        map.put(3,"日本");
        map.put(4,"韩国");
        //遍历
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
        //还可以使用Foreach遍历，底层就是迭代器原理哦，还记得吧！
        Set<Integer> set1 = map.keySet();
        for (Integer integer : set1) {
            System.out.println(map.get(integer));
        }
    }
    @Test
    public void HashMapDemo3() {
        //Map集合的遍历方式2:通过键值对对象遍历
        //entrySet()可以获取所有键值对对象的集合
        // 如果键值对比成夫妻，entry就相当于结婚证，即关系对象。
        //创建HashMap集合
        Map<Integer,String> map=new HashMap<>();
        //添加
        map.put(1,"中国");
        map.put(2,"美国");
        map.put(3,"日本");
        map.put(4,"韩国");
        //foreach遍历
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }
        //迭代器遍历
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey()+"=="+next.getValue());
        }
    }
    @Test
    public void HashMapDemo4() {
        //使用HashMap存储自定义对象类型测试定义学生对象类student，键为学号，值为学生对象。
        Map<Integer,student> map=new HashMap<>();
        map.put(1,new student("张强",18,87));
        map.put(2,new student("刘梦佳",18,84));
        map.put(3,new student("小红",19,23));
        map.put(4,new student("张梓馨",18,28));
        map.put(4,new student("李梓馨",18,30));
        System.out.println(map);
        //测试发现学号为4的李梓馨同学覆盖了张梓馨这个成绩为28分同学哈哈
        //keySet的foreach遍历
        Set<Integer> integers = map.keySet();
        System.out.println("keySet的foreach遍历");
        for (Integer integer : integers) {
            System.out.println(map.get(integer));
        }
        //keySet的迭代器遍历
        Set<Integer> integers1 = map.keySet();
        Iterator<Integer> iterator = integers.iterator();
        System.out.println("keySet的迭代器遍历");
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(map.get(next));
        }

    }
}
