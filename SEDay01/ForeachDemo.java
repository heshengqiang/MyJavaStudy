package SEDay01;

import org.junit.Test;

import java.util.ArrayList;

public class ForeachDemo {
    //增强for循环：格式(数据类型 变量名:数组/集合)底层就是采用迭代器实现的，只是语法更简单。
    @Test
    public void ForeachDemo1(){
        //定义数组遍历数组
        int arr[]={1,2,3,5,4,67,76,3};
        for(int arrs:arr){
            System.out.println(arrs);
        }

    }
    @Test
    public void ForeachDemo2(){
        //定义集合遍历集合
        ArrayList<String> list=new ArrayList<>();
        list.add("hds");
        list.add("gfd");
        list.add("dff");
        list.add("ads");
        list.add("ads");
        for(String  lists:list){
            System.out.println(lists);
           // list.add("sdf");//这里肯定会出现异常啦！迭代器原理哦遍历时不能改变集合长度哦
        }

    }
}
