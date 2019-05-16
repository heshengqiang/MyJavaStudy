package Spring.Demo;

import Spring.Dao.ProductDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductDaoDemo {
    @Test
    public void Demo1(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring/config/applicationContext3.xml");
        ProductDao productDao =(ProductDao) applicationContext.getBean("productDao");
       productDao.SelectProduct();
        productDao.DeleteProduct();
         productDao.InsertProduct();
          productDao.UpdateProduct();
    }
}
