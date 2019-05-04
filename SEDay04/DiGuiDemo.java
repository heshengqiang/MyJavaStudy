package SEDay04;


import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

public class DiGuiDemo {
    /*递归测试:递归需要注意不能无限递归,需要有一个出口(最好不要用递归)
    递归分类:
    1.直接递归:在A方法内部调用A方法
    2.间接递归:在A方法内部调用B方法,在B方法内部调用C方法,在C方法内部调用A方法
    */
    int sum=0;//用于在方法getSum()中
    public static void main(String args[]){
        DiGuiDemo diGuiDemo=new DiGuiDemo();
        //diGuiDemo.DiGui(0);
        //diGuiDemo.getSum(100);
        //int ji = diGuiDemo.getJi(3);
       // System.out.println(ji);
        diGuiDemo.DiGuiDemo3("A://C#Study");
    }

    public void DiGui(int num){
        if(num>10000){
            return;
        }
        System.out.println("test....");
        num++;
        DiGui(num);
    }

   //求1+2+3+n的和,这里使用递归,不用循环,开发中用循环,这里递归为了练习.
    public void getSum(int num){
        if(num<=0){
            System.out.println("和为: "+sum);
            return;
        }
        sum+=num;
        num--;
        getSum(num);
    }
    //求1*2*3*n的积,这里使用递归
    public int getJi(int num){
        if (num==1){
            return 1;
        }
        return getJi(num-1)*num;
    }
    //递归法遍历文件夹
    public void DiGuiDemo3(String path) {
        File f1 = new File(path);
        ArrayList<String> arrayList = new ArrayList<>();
        File[] files = f1.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                arrayList.add(file1.getPath());
            } else {
                DiGuiDemo3(file1.getAbsolutePath());
            }
        }
        boolean contains = arrayList.contains("path");//判断是否存在该文件夹
        if (contains){
            System.out.println("文件存在!");
        }
        for (String arr : arrayList) {
            System.out.println(arr);//打印所有文件夹
        }

    }
}
