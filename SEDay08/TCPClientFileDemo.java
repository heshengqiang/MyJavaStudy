package SEDay08;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientFileDemo {
    //客户端
    public static void main(String args[])throws Exception{
        //创建socket对象,连接服务器
        Socket client=new Socket("127.0.0.1",2020);
        //2.从客户端对象中获取输出流getOutputStream()
        OutputStream outputStream = client.getOutputStream();
        //创建文件的输入流,读取文件数据
        FileInputStream fis=new FileInputStream("Client.txt");
        int len=0;
        byte [] bs=new byte[1024];
        while ((len=fis.read(bs))!=-1){
            //3.调用输出流的write写数据到服务器
            outputStream.write(bs,0,len);
        }
        //这个可以修复之前收不到服务器反馈过来的bug
        //这个方法理解为叫客户端对象关闭输出流,这个时候服务器就会知道文件传输成功,
        // 服务器的输入流也会关闭,然后就会给客户端反馈信息了
        client.shutdownOutput();
        InputStream inputStream = client.getInputStream();
        byte [] bytes=new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes,0,read));
        client.close();
        fis.close();
    }
}
