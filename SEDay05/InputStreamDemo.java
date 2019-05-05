package SEDay05;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
    /*
        OutputStream是一个抽象类：
        public int read();
        public int read (byte [] bs);
     */
    @Test
    public void InputStreamDemo1() throws IOException {
        //文件不存在会抛出异常
        FileInputStream fis=new FileInputStream("java.txt");
        //读取一个字节
        //int read = fis.read();
        //System.out.println((char)read);fis.close();
        //读取字节的标准代码：
        /*int b=0;//用来记录每次读到的码值
        //!=-1的意思是：因为读取到末尾的时候码值为-1，即到了-1就不读了，读取结束。。。
        while ((b=fis.read())!=-1){
            System.out.print((char)b);
        }
        fis.close();*/
        //读取字节数组的标准代码：
        byte [] bs=new byte[4];
        int len=0;//返回字节数组读取字节长度，如果没有则会返回-1
        while ((len=fis.read(bs))!=-1){
            System.out.print(new String(bs,0,len));
        }
        fis.close();

    }
}
