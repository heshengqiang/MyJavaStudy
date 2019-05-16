package Spring.ServiceImp;
import Spring.Pojo.user;
import Spring.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceImp implements UserService {
    //显示用户信息
    public void ShowUserInfo() {
        //加载xml文件，即spring的配置文件
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:Spring/config/applicationContext1.xml");
        user user = (user)applicationContext.getBean("user");
        System.out.println(user.toString());

    }
}
