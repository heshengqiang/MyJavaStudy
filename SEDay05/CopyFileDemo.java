package SEDay05;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.currentTimeMillis;

public class CopyFileDemo {
    @Test
    //以字节方式复制文件：首先读取源文件，再写入目标文件，一边读取一边写入，最后关闭流
    public void CopyFileDemo1()throws IOException {
        FileInputStream fis=new FileInputStream("java.txt");
        FileOutputStream fos=new FileOutputStream("copy.txt");
        long start = currentTimeMillis();
        int b=0;
        while ((b=fis.read())!=-1){
            fos.write(b);
        }
        long ends=currentTimeMillis();
        System.out.println(ends-start+"ms");
        fos.close();
        fis.close();
    }
    @Test
    //以字节数组方式复制文件：首先读取源文件，再写入目标文件，一边读取一边写入，最后关闭流
    public void CopyFileDemo2()throws IOException {
        FileInputStream fis=new FileInputStream("java.txt");
        FileOutputStream fos=new FileOutputStream("copy.txt");
        long start = currentTimeMillis();
        byte [] bs=new byte[1024];//用来保存读取字节的数组
        int len=fis.read(bs);//保存实际读取到的字节数，举例因为可能读取到的字节不足1024
        fos.write(bs,0,len);//从字节数组0位置开始写，写到len长度，即读多少写多少
        long ends=currentTimeMillis();
        System.out.println(ends-start+"ms");//这里可以看出使用字节数组方式明显快
        fos.close();
        fis.close();

    }
}
