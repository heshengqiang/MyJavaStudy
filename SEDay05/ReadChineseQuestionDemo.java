package SEDay05;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadChineseQuestionDemo {
    @Test
    public void ReadChineseQuestionDemo1()throws IOException{
        FileOutputStream fos=new FileOutputStream("copy.txt");
        byte[] bytes = "放大还是车站学科交叉学科交叉创造科学家从v下".getBytes();
        fos.write(bytes);
        //以字节数组方式读取中文,可能出现乱码，这个时候可以使用字符流
        FileInputStream fis=new FileInputStream("copy.txt");
        byte[] bs=new byte[1024];
        int len=0;
        while ((len=fis.read(bs))!=-1){
            System.out.println(new String(bs,0,len));
        }
        //以字节方式读取中文，一定出现乱码
        /*int b=0;
        while ((b=fis.read())!=-1) {
            System.out.print((char) b);
        }*/
        fos.close();
        fis.close();
    }
}
