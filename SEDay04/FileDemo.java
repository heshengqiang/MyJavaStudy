package SEDay04;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    //File类:对文件或目录路径名的抽象表示
    //File类的构造：
    /*
    * 1.public void File(String path);
    * 2.public void File(String parent,String child);
    * 3.public void File(file parent,String child);
    * */
    @Test
    public void  FileDemo1(){
        //用A:\C#Study\github.txt文件举例
        //1.public void File(String path);
        File f1=new File("A:\\C#Study\\github.txt");//以盘符开头为绝对路径
        System.out.println(f1);
        //2.public void File(String parent,String child);
        File f2=new File("A:\\C#Study","github.txt");
        System.out.println(f2);
        //3.public void File(file parent,String child);
        File parent=new File("A:\\C#Study");
        File f4=new File (parent,"github.txt");
        System.out.println(f4);
        //测试结果为都打印出来文件的绝对路径：A:\C#Study\github.txt
    }


    /*
    * File对象的获取方法
    * 1.public String getAbsolutePath();//获取绝对路径
    * 2.public String getName();获取当前File对象名字
    * 3.public String getPath();获取File对象的路径
    * 4.public Long length();获取File对象的字节数
    * */
    @Test
    public void  FileDemo2(){
        File f1=new File ("github.txt");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);
        File f2=new File("A:\\C#Study\\github.txt");
        File f3=new File("A:\\C#Study");
        String name1 = f2.getName();
        String name2 = f3.getName();//获取文件或文件夹名
        System.out.println(name1);
        System.out.println(name2);
        File f4=new File("A:\\C#Study\\github.txt");
        long length1 = f4.length();
        System.out.println(length1);//测试结果返回f4对象的字节数，即github.txt内容的字节数
        //(字母表示一个字节,文字表示2个字节)
        File f5=new File("A:\\C#Study");
        long length2 = f5.length();
        System.out.println(length2);//不能计算文件夹长度
    }



    /*
    * File对象的删除和创建方法:
    *  1.创建文件:public boolean createNewFile()(只能创建文件)
    *  2.创建文件夹:public boolean mkdir()(只能创建文件夹)
    *
    * */
    @Test
    public void  FileDemo3() throws IOException {
        //通过createNewFile()创建文件
        File f1=new File("A:\\C#Study\\123.txt");
        boolean newFile = f1.createNewFile();
        if (newFile){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
            //第二次运行就创建失败,说明文件123.txt已经存在
        }
        File f2=new File("A:\\测试文件夹");
        boolean mkdir = f2.mkdir();
        if (mkdir){
            System.out.println("文件夹创建成功");
        }else{
            System.out.println("文件夹创建失败");
        }

    }
    @Test
    public void  FileDemo4() {
       /* 判断方法:
         1.判断文件或者文件夹是否存在:public boolean exists();
         2.判断是否是文件目录(文件夹):public boolean isDirectory();
         3.判断是否是文件:public boolean isFile();
       */
        File f1=new File("A:\\C#Study");
        File f2=new File("A:\\C#Study\\github.txt");
        boolean directory = f1.isDirectory();
        boolean file = f2.isFile();
        if (f1.exists()&&f2.exists()){
            if (directory){
                System.out.println("f1是文件夹");
            }else{
                System.out.println("f1是文件");
            }
            if (file){
                System.out.println("f2是文件");
            }else{
                System.out.println("f2是文件夹");
            }
        }else {
            System.out.println("文件或文件夹不存在!");
        }
        }
    @Test
    public void  FileDemo5() {
        //删除文件或空的文件夹:public boolean delete();
        File f1=new File("A:\\C#Study\\123.txt");
        if (f1.exists()){
            boolean delete = f1.delete();
            if (delete){
                System.out.println(f1.getName()+"删除成功");
            }
        }else {
            System.out.println("不存在");
        }
        File f2=new File("A:\\测试文件夹");
        if (f2.exists()){
            boolean delete = f2.delete();
            if (delete){
                System.out.println(f2.getName()+"删除成功");
            }
        }else {
            System.out.println("文件不存在");
        }
    }

}
