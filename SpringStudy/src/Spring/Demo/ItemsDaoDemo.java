package Spring.Demo;

import Spring.Dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsDaoDemo {
    @Test
    public void Demo1(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("Spring/config/applicationContext4.xml");
        ItemsDao itemsDao = (ItemsDao) applicationContext.getBean("itemsDao");
        itemsDao.FindAllItems();
    }
}
