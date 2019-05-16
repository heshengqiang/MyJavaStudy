package Spring.Demo;

import Spring.Service.CollectionService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDemo {
    @Test
    public void CollectionDemo1(){
       ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("classpath:Spring/config/applicationContext1.xml");
        CollectionService collectionService =(CollectionService) ApplicationContext.getBean("collectionService");
        collectionService.ShowList();
        collectionService.ShowMap();
    }
}
