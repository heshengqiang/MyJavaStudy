package Spring.Demo;

import Spring.Dao.OrderDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class OrderDaoDemo {

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:Spring/config/applicationContext5.xml");
        OrderDao orderDao = (OrderDao) applicationContext.getBean("orderDao");
        orderDao.save();
        orderDao.delete();
        orderDao.update();
        orderDao.find();
    }
}
