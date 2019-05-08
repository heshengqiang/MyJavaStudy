package SEDay08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerFileDemo {

    public static void main(String args[])throws Exception{
        //服务器端,端口号2020
        ServerSocket server =new ServerSocket(2020);
        while (true){
        System.out.println("等待客户端连接....");
        //获取到哪个客户端连接的我,服务器端获取到客户端对象
         final  Socket client = server.accept();
        //开启一个线程与客户端进行交互
            new Thread(new Runnable() {
                @Override
                public void run(){
                    //通过获取到的客户端对象得到服务区输入流,等同于客户端的输出流
                    try {
                        InputStream inputStream = client.getInputStream();

                    FileOutputStream fos=new FileOutputStream("Server.txt");
                    byte[] bs=new byte[1024];
                    int len=0;
                    while((len=inputStream.read(bs))!=-1)
                    {
                        fos.write(bs, 0, len);
                        System.out.println(new String(bs,0,len));
                    }
                    //给客户端回馈信息,告诉客户端我已收到信息
                    OutputStream outputStream = client.getOutputStream();
                    outputStream.write("服务器已接受到文件...".getBytes());
                    //关闭资源
                    //server.close();
                    client.close();
                    fos.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }



}
