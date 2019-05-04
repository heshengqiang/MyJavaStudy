package SEDay04;

import java.io.File;
import java.io.FileFilter;

public class MyFileFileter implements FileFilter {
    //需求:现在只需要该文件夹下以 .txt 结尾的文件名(通过MyFileFilter实现过滤)
    public boolean accept(File pathname) {
        if (pathname.getName().endsWith(".txt")){
            return true;
        }
        return false;
    }
}
