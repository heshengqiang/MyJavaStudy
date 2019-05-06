package SEDay06;

import org.junit.Test;

import java.io.*;

public class InputStreamReaderDemo {
    //InputStreamReader,由字节通向字符的桥梁，解码过程
    @Test
    public void InputStreamReaderDemo1()throws IOException{
        //FileInputStream fis=new FileInputStream("copy.java");
        //默认是GBK码表，如果换成UNF-8码表，则使用charsetName设置
        //InputStreamReader isr=new InputStreamReader(fis,"GBK");
        FileReader fr=new FileReader("copy.java");
        //FileReader是InputStreamReader的子类，如果为GBK方式，直接用FileReader即可创建字符流
        File f1=new File("copy.java");
        int len =0;
        char [] bs=new char[1000];
        long s = System.currentTimeMillis();
        while ((len= fr.read(bs))!=-1){
            System.out.print(new String(bs,0,len));
        }
        long e = System.currentTimeMillis();
        System.out.println(e-s+"ms");
        System.out.println(f1.length());
        fr.close();

    }
}
