package SEDay04;

import org.junit.Test;

import javax.annotation.processing.FilerException;
import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {
    //文件过滤器测试
    @Test
    public void FileFilterDemo1(){
        File f1=new File("A:\\C#Study");
        //创建过滤器对象
        FileFilter fileFilter =new MyFileFileter();
        //这里添加文件过滤器,过滤器为自定义过滤器MyFileFilter
        //需求:现在只需要该文件夹下以 .txt 结尾的文件名(通过MyFileFilter实现过滤)
        File[] files = f1.listFiles(fileFilter);
        for (File file : files) {
            System.out.println(file);
        }
    }
}
