package SEDay08;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
* TCP通信步骤:d-a-e-b-f-g-c(不一定是按这步骤来
* 客户端:
* 1.创建Socket对象,传入服务器的ip地址和端口号---a
* 2.通过Socket对象获取输出流,通过write方法写入数据到服务器---b
* 3.客户端通过输入流调用read方法读取服务器端反馈的信息---c
*
* 服务器端:
* 1.创建ServerSocket对象,传入端口号,跟客户端的端口号一致---d
* 2.ServerSocket对象通过accept方法获取哪个客户端对象与自己连接---e
* 3.再通过这个获取的客户端对象的输入流,通过read方法获取客户端发来的信息---f
* 4.还可以通过客户端对象的输出流,调用write方法给客户端发聩信息---g
*
*
*
*
*
* */





public class ServerClient {
    public static void main(String args[])throws Exception{
        //TCP协议服务器端
        ServerSocket serverSocket=new ServerSocket(2020);
        //获取到哪个客户端连接的我,服务器端获取到客户端对象
        System.out.println("等待客户端连接.....");
        Socket client = serverSocket.accept();//此方法具有等待作用,等待某一客户端的连接
        //打印一些客户端的信息:
        String hostName = client.getInetAddress().getHostName();
        //通过获取到的客户端对象得到服务区输入流,等同于客户端的输出流
        InputStream inputStream = client.getInputStream();
        byte [] bytes =new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(hostName+"发送信息为:"+new String(bytes,0,read));
        //给客户端回馈信息,告诉客户端我已收到信息
        OutputStream outputStream = client.getOutputStream();
        outputStream.write("服务器已收到消息..".getBytes());
        //关闭资源
        serverSocket.close();
        client.close();
    }
}
