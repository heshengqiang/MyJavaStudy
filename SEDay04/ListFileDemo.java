package SEDay04;

import org.junit.Test;

import java.io.File;

public class ListFileDemo {
    //File类的list()listFiles()方法
    //1.public String[] list();
    //2.public File[] listFiles();
    @Test
    public void ListFileDemo1(){
        //1.public String[] list();
        File f1=new File("A:\\C#Study");
        String[] list = f1.list();//获取文件夹下的所有目录名
        for (String lists : list) {
            System.out.println(lists);
        }
        //用得很多
        File f2=new File("A:\\C#Study");
        File[] files = f2.listFiles();//获取文件夹下的所有目录的绝对路径
        for (File file : files) {
            System.out.println(file);
        }
        /*
        如果删除一个文件夹下的文件,可以通过遍历文件夹下的所有文件来逐个删除
        这时候用listFiles方法搭配delete方法即可完成
        * */
    }

}
