package Spring.Demo;

import Spring.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceDemo {
    @Test
    public void UserServiceDemo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:Spring/config/applicationContext1.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.ShowUserInfo();
    }
}
