package SEDay08;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TCPUDPDemo {
   /*
    UDP协议：用户数据报协议
    特点：面向无连接，不需要连接网，不需要管对方是否开机，是否存在。
    缺点：数据不安全，不完整
    优点：效率高，
    eg：发短信，共屏软件，加卡塔卡，QQ视频等
    TCP：传输控制协议
    特点：面向有连接，必须建立连接才能传输信息
         比如：打电话，上网等
         TCP建立连接有三个步骤(三次握手)
         举例：连接百度：你先联系百度，百度存在你收到回应，
                         你在对百度进行一次回应，三次握手完成，此时建立连接
    */
   public void UDPDemo1(){
     //使用UDP协议进行数据通信，需要用到两个类
       //1.数据的发送接收器   DatagramSocket(Datagram :数据包，数据报)
      //2.数据包类：   DatagramPacket



   }






}
