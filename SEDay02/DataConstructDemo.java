package SEDay02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class DataConstructDemo {
    /*
    堆栈结构：特点：先进后出
    队列结构：特点：先进先出
    链表结构：特点：查询速度慢，增删速度快
    数组结构：特点：查询速度快，增删速度慢，因为数组定长
    哈希表结构：特点：查询速度较快，增删速度较快
    */
    @Test
    public void DataConstructDemo1(){
        /*
        List接口特点：
        1.有下标
        2.有序的（存和取的顺序一致）
        3.可以重复数据
        实现类：
        1.ArrayList:底层采用数组结构
        2.LinkedList：底层采用链表结构(测试)
        3.Vector：底层采用数组结构，线程安全，效率比ArrayList低
        *List结构方法：index：下标
        * 1.增：add(E e);add(int index,E e);
        * 2.删：remove(Object obj);remove(int index)
        * 3.改：set(int index,E e);//通过下标修改元素
        * 4.查：get(int index);
        * List实现类方法：
        * ArrayList:基本和List无差别(测试)
        * LinkedList:特有的方法是大量的首尾操作的方法(测试)
        * addFirst(E e);//添加元素在集合首部
        * addLast(E e);//添加元素在集合尾部
        * removeFirst(E e);//删除首元素，返回被删元素
        * removeLast(E e);//删除尾元素，返回被删元素
        * getFirst();//获取集合首个元素
        * getLast();//获取集合尾元素
        * E pop();//功能和removeFirst一样
        * void push(E e);//功能和addFirst一样
        */
        //代码测试，这里只测试LinkedList 的get pop push set 四个方法
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.push("aaa");
        linkedList.push("bbb");
        linkedList.push("ccc");
        linkedList.push("ddd");
        System.out.println(linkedList);
        //删除集合中首个元素
        String pop = linkedList.pop();
        System.out.println(pop);//返回被删元素
        String s = linkedList.get(0);//index中第一个元素的下标为0开始
        System.out.println(s);
        //修改aaa为AAA
        linkedList.set(0, "AAA");
        String s1 = linkedList.get(0);
        System.out.println(s1);
    }
    @Test
    public void DataConstructDemo2(){
        /*
        Set接口特点：
        1.无下标
        2.无序的（存和取的顺序不一定一致）
        3.不可以重复数据
         Set结构中特有的方法：没有，基本和父接口Collection方法一致
         实现类：HashSet:底层采用哈希表结构
                 LinkedHashSet:底层采用链表+哈希表结构（非常复杂）
        */
        //方法跟Collection集合一致，这里给出几个方法的测试
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("aaa");
        boolean b = hashSet.contains("aaa");
        boolean b1 = hashSet.remove("aaa");
        hashSet.clear();
    }
    @Test
    public void DataConstructDemo3(){
        /*
        * 对象的哈希值：任何一个对象都有一个哈希值，就是一个对象的数字表示
        * 对象的String表示：toString方法格式：包名.类名@地址值
        * 获取对象的哈希值：hashCode(),每个对象都有这个方法
        * */
        //测试 创建一个person类
        person person1=new person("fd","21");
        person person2=new person("fd","21");
        System.out.println(person1.hashCode());
        System.out.println(person1.toString());
        System.out.println(person2.hashCode());
        System.out.println(person2.toString());
        //测试结果显示:地址值就是哈希值的十六进制表示,并且person1与person2的哈希值不一致
        //字符串的哈希值
        String name1="aaa";
        String name2="aaa";
        System.out.println(name1.hashCode()==name2.hashCode());
        //哈希值相同,因为字符串的哈希值是通过内容算的
        //字符串不同,哈希值可能会一样,举例如下
        int i1 = "重地".hashCode();
        int i2 = "通话".hashCode();
        System.out.println(i1);
        System.out.println(i1);
    }
    @Test
    public void DataConstructDemo4(){
        //HashSet和LinkedHashSet的区别测试
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("abc");
        hashSet.add("dsf");
        hashSet.add("abc");
        hashSet.add("wer");
        hashSet.add("sdr");
        System.out.println(hashSet);//输出结果[sdr, abc, wer, dsf]显示出无序性和不重复性
        HashSet<String> hashSet1=new LinkedHashSet<>();
        hashSet1.add("abc");
        hashSet1.add("dsf");
        hashSet1.add("abc");
        hashSet1.add("wer");
        hashSet1.add("sdr");
        System.out.println(hashSet1);//输出结果[abc, dsf, wer, sdr]显示出有序性和不重复性
    }
    @Test
    public void DataConstructDemo5(){
        HashSet<person> hashSet=new HashSet<>();
        hashSet.add(new person("he","1001"));
        hashSet.add(new person("he","1001"));
        hashSet.add(new person("he","1001"));
        System.out.println(hashSet);
        /*
        测试结果显示虽然name和id相同但是可以加进去,这不是说违背HashSet的不重复性
        而是因为他们属性值相同但是哈希值却不同
        如果要使当属性值相同就不再重复添加,
        就可以在自定义类中重写hashCode和toString方法,用快捷键就行.
        */
    }
    @Test
    public void DataConstructDemo6(){
        ArrayList<String> arrayList=new ArrayList<>();
        HashSet<String> hashSet=new HashSet<>();
        arrayList.add("aaa");
        hashSet.add("aaa");
        boolean aaa = arrayList.contains("aaa");
        boolean aaa1 = hashSet.contains("aaa");
        System.out.println(aaa);
        System.out.println(aaa1);
        /*
        * HashSet和ArrayList的contains方法原理比较:
        * 1.HashSet的contains方法:先对元素进行哈希值比较,再对元素的equals方法比较.
        * 1.ArrayList的contains方法:直接进行元素的equals方法比较.
        * */
    }

}
