package SEDay01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
        //Collection为所有集合的公共接口，即所有集合都继承该接口
        //Iterator迭代器，是所有集合所自带的一个用来遍历集合元素的工具，
        // 可以将它理解为一个仓库管理员，你可以向它去查找你要找的元素。通过iterator()方法获得
        @Test
        public void IteratorDemo1(){
            ArrayList<String> list = new ArrayList();
            list.add("灌输");
            list.add("琉璃");
            list.add("网点");
            list.add("炸弹");
            //通过自带的迭代器来遍历对象
            Iterator<String> it = list.iterator();
            while (it.hasNext()){
                 //该操作理解为管理员即迭代器去仓库取出对象
                // 深入理解为hasNext为指针指向的对象，而next相当于移动指针值向下一个对象
                String next = it.next();
                System.out.println(next);
            }

        }
           @Test
          public void IteratorDemo2(){
               ArrayList<String> list = new ArrayList();
               list.add("abc");
               list.add("cde");
               list.add("dsf");
               list.add("ssf");
               //通过自带的迭代器来遍历对象
               Iterator<String> it = list.iterator();
               //判断是否有abc字符串，如果有则修改为ABC比较时应该把常量放前面，防止空指针异常
               while ("abc".equals(it.next())){
                   //该操作理解为管理员即迭代器去仓库取出对象
                   // 深入理解为hasNext为指针指向的对象，而next相当于移动指针值向下一个对象
                   list.add("ABC");//元素增加，修改了集合长度，此时会有异常ConcurrentModificationException发生
                   list.remove("abc");//同样发生异常
               }
           }
    }

