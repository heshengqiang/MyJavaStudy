package SEDay05;

import org.junit.Test;

import java.io.*;

public class CopyDirectoryDemo {
    //文件夹的复制
    //数据源：C:\Users\www07\Desktop\JAVA Study\src11
    //目标文件夹：A:\Demo
    @Test
    public void CopyDirectoryDemo1() throws IOException {
        //1.先判断文件夹是否存在
        File FileSrc=new File("C:\\Users\\www07\\Desktop\\JAVA Study\\src11");
        File FileObj=new File("A:\\Demo");
        if(FileObj.exists()){
            System.out.println("Demo文件夹已经存在！");
        }else {
            boolean mkdir = FileObj.mkdir();
            if (mkdir){
                System.out.println("创建Demo文件夹成功！");
            }
        }
        //列出原文件夹下的所有文件
        File[] files = FileSrc.listFiles();
        for (File file : files) {
            File obj= new File(FileObj,file.getName());
            FileCopy(obj,file);//目标文件夹，原文件夹
        }
        System.out.println("文件夹"+FileSrc+"成功复制到"+FileObj);
    }
    public void FileCopy(File copy,File src)throws IOException{
        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(copy);
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte [] bs=new byte[1024];
        int len=0;
        while ((len=bis.read(bs))!=-1){
            bos.write(bs,0,len);
        }
        bos.close();
        bis.close();
        fis.close();
        fos.close();
        System.out.println("文件复制"+src.getName()+"成功！");


    }
}
