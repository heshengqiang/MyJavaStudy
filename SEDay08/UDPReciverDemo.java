package SEDay08;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReciverDemo {
    public  static void main(String args[]) throws Exception {
            DatagramSocket ds=new DatagramSocket(1212);

                byte[] bytes = new byte[1024];
                while (true) {
                    DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
                    ds.receive(dp);
                    System.out.println("接受数据成功！");
                    InetAddress address = dp.getAddress();
                    System.out.println("发送端ip是：" + address.getHostAddress());
                    System.out.println("发送端主机：" + address.getHostName());
                    //获取dp中的数据
                    byte[] data = dp.getData();
                    int length = dp.getLength();
                    System.out.println(new String(data, 0, length));
                }

    }
}
