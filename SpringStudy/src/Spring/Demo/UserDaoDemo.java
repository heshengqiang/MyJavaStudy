package Spring.Demo;


import Spring.Dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    @Test
  public void UserDaoDemo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring/config/applicationContext2.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        userDao.ShowUserInfo();

  }


}
