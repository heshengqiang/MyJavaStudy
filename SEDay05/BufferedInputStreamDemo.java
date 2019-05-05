package SEDay05;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    @Test
    public void BufferedInputStreamDemo1() throws IOException {
        FileInputStream fis=new FileInputStream("java.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
       /* int read =0; //一次读取一个字节
        long s = System.currentTimeMillis();
        while ((read=bis.read())!=-1){
            System.out.print((char)read);
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s+"ms");*/
        //以字节数组形式读取
        byte [] bs=new byte[1024];
        int len=0;
        long s = System.currentTimeMillis();
        while ((len=bis.read(bs))!=-1){
            System.out.print(new String(bs,0,len));
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s+"ms");
        //字节数组形式读取数据快很多
        bis.close();
        fis.close();


    }
}
