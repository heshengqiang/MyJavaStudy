package SEDay08;

import org.junit.Test;

import java.net.InetAddress;

public class InetAddressDemo {
    @Test
    public void InetAdressDemo1() throws Exception {
        //获取本机的用户名和IP地址
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("用户名/IP地址： "+localHost);
        String hostName = localHost.getHostName();
        String hostAddress = localHost.getHostAddress();
        System.out.println("用户名："+hostName);
        System.out.println("IP地址："+hostAddress);
        //通过主机名获取其他主机的IP地址
        InetAddress address = InetAddress.getByName("www.github.com");
        System.out.println(address);

    }


}
