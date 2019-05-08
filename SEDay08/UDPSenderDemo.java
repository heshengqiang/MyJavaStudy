package SEDay08;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSenderDemo {

    public  static void main(String args[]) throws Exception{
        //创建DatagramSocket数据接受发送器对象
        DatagramSocket ds = new DatagramSocket();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入发送的信息：");
            String data = in.next();
            byte[] bytes = data.getBytes();
            //ip地址：127.0.0.1代表本机，回环地址
            //dp存储发送的数据，ip地址，端口号
            DatagramPacket dp =
                    new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 1212);
            ds.send(dp);
            System.out.println("发送数据成功！");
        }

    }
}
