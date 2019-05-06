package SEDay06;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    //OutputStreamWriter一种字符流，通向字节流的桥梁，查码表，编码过程。
    @Test
    public void OutputStreamWriterDemo1()throws IOException{
        FileOutputStream fos=new FileOutputStream("copy.java");
        byte[] bytes = "中国".getBytes();
        fos.write(bytes);
        OutputStreamWriter ows=new OutputStreamWriter(fos);
        ows.close();
    }
}
