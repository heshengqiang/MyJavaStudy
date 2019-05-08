package SEDay08;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//使用TCP协议的客户端Socket(连接要指定ip和端口号)
public class ClientDemo {
    public static void main(String args[])throws Exception{
   //1.创建Socket对象，即客户端对象
        Socket client=new Socket("127.0.0.1",2020);
        //2.从客户端对象中获取输出流getOutputStream()
        OutputStream outputStream = client.getOutputStream();
        //3.调用输出流的write写数据到服务器
        byte[] bytes = "服务器你好！".getBytes();
        outputStream.write(bytes);
        client.shutdownOutput();
        //读取服务器反馈的信息,了解服务器是否收到消息
        InputStream inputStream = client.getInputStream();
        byte [] bs=new byte[1024];
        int len=inputStream.read(bs);
        System.out.println(new String(bs,0,len));
        //4.关闭资源
        client.close();

    }
}
