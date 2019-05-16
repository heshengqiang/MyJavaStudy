package Spring.ServiceImp;

import Spring.Dao.UserDao;
import Spring.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
@Service(value = "userService")//这个就是之前在xml中配置的bean了因为这里是Service层故用@Service
public class UserServiceImp注解方式 implements UserService {

    //通常情况下Service层需要调用Dao层，就需要通过注解方式将Dao层的对象注入进来
    @Resource(name = "userDao")
    private UserDao userDao;
    public void ShowUserInfo() {
        userDao.ShowUserInfo();
        System.out.println("这是Service层");
    }


    //相当于<bean init-method="init"/>
    @PostConstruct
    public void init() {

        System.out.println("spring工厂管理将类实例化了。。。");
    }

    //相当于<bean destroy-method="destroy"/>
    @PreDestroy
    public void destroy(){
        System.out.println("spring工厂管理将类销毁了。。。");
    }

}
