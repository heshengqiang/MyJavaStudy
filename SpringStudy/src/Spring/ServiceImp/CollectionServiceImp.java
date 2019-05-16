package Spring.ServiceImp;

import Spring.Pojo.Collection;
import Spring.Service.CollectionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class CollectionServiceImp implements CollectionService {
    public ApplicationContext applicationContext;
    public ApplicationContext getApplicationContext() {
     applicationContext=new ClassPathXmlApplicationContext("classpath:Spring/config/applicationContext1.xml");
        return applicationContext;
    }

    @Override
    public void ShowList() {
        Collection collection =(Collection )this.getApplicationContext().getBean("collection");
        System.out.println(collection.getList());
    }

    @Override
    public void ShowMap() {
        Collection  collection = (Collection)this.getApplicationContext().getBean("collection");
        Map map = collection.getMap();
        //获取map集合中所有键的集合
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object o = map.get(iterator.next());
            System.out.println(o);
        }
    }
}
