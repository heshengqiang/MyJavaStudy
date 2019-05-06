package SEDay06;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

//使用IO框架测试，导入IO框架包commons-io
public class Commons_IODemo {
    public static void main(String args[])throws IOException {
        //将内容写入到文件中
        FileUtils.writeStringToFile(new File("comm-io.java"),"这里数填写到文件的内容");
        //将文件内容读取出来
        String readFileToString = FileUtils.readFileToString(new File("comm-io.java"));
        System.out.println(readFileToString);
        //复制文件
        FileUtils.copyFile(new File("comm-io.java"),new File("copy.java"));
        //复制文件夹
        //FileUtils.copyDirectory();
    }

}
