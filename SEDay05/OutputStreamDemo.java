package SEDay05;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class OutputStreamDemo {
    //根据流的方向分类：input输入流(由文本到程序)，output输出流(由程序到文本)
    //字符流：只能操作文本文件，即用文本工具打开能看懂的文字文本
    //字节流：能操作一切文件，包括文本文件，mp3、视频、avi。。。等等
    /*
    * 字符输出流：
    * 共同父类 Writer 比如：FileWriter BufferWriter
    * 功能：写一个字符，写一个字符串，写一个字符数组
    * 字符输入流：
    * 共同父类 Reader 比如：FileReader BufferReader
    * 功能：读取一个字符，或字符数组
    * 字节输入流：
    * 共同父类：InputStream  比如：FileInputStream BufferInputStream
    * 功能：读取一个字节，读取一个字节数组
    * 字节输出流：
    * 共同父类：OutputStream 比如：FileOutputStream BufferOutputStream
    * 功能：写一个字节，写一个字节数组
    * 输出流：Writer
    * 输入流：Reader
    * Java流的命名非常规范：功能+父类名
    *
    * */
    @Test
    public void OutputStreamDemo1() throws Exception {
        /*
        OutputStream是一个抽象类：
        public void close();//关闭流
        public void flush();//刷新流
        public void writer(int b);//写一个字节
        public void writer(byte[] bs);//写一个字节数组
        public void writer(byte[] bs,startIndex,int length);写字节数组的一部分
        */
        //创建流对象
        //FileOutputStream(String fileName,boolean flag)flag默认为false即不续写
        FileOutputStream fos1=new FileOutputStream("java.txt");
        //用字节形式写入文件java.txt中
        fos1.write("java.outputStreamDemo".getBytes());
        fos1.close();//关闭流
    }
}
