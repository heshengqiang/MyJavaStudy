package SEDay05;

import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
       /*
       BufferedOutputStream:缓冲输出流
       BufferedInputStream:缓冲输入流
       使用缓存流的意义是可以大大提高效率
       */
       @Test
       public void BufferedOutputStreamDemo1() throws IOException {
           FileOutputStream fos=new FileOutputStream("java.txt");
           BufferedOutputStream bos=new BufferedOutputStream(fos);
           //bos.write(100);//写一个字节
           byte[] bytes = "javaBuffedStream".getBytes();
           //bos.write(bytes,0,3);//写一个字节数组一部分
           bos.write(bytes);//写一个字节数组
           bos.close();
           fos.close();
       }
}
