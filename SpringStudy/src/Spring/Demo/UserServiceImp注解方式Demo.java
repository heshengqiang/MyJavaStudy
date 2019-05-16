package Spring.Demo;

import Spring.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*

* *****使用spring注解开发先需要在xml中打开注解包扫描器：
* <context:component-scan base-package=""/> 表示指定哪个包进行注解开发
* Spring注解开发：
* @Component(value="")用于修饰一个类，意思就是将这个类交给Spring管理即xml中的bean配置
* 但是我们一般有分为Web层、Service层、Dao层，所以就有了@Component的衍生注解，其实效果跟@Component
* 作用一样，都是表示把这个类交给spring管理，只是为了方便开发使得开发更加规范
* 类上的注解：
* Web：@Controller
* Service层：@Service
* Dao层：@Repository(Repository：仓库，存储库，相当于数据库的意思，而Dao层就是跟数据库打交道的，故为这个)
* 属性注入的注解：
* @Value：设置普通属性的值
* @Value("贺圣强")
* private String name;
* 对象属性注解：
* @Resource(name="")设置对象属性的值，按照名称完成属性注入
*
* 其他属性注解（了解）：
* @PostConstruct//相当于bean中的init-method的配置
* @PreDestroy//相当于bean中的destroy-method的配置
*
* 作用范围注解：
* @Scope("prototype")//表示这个管理的类可以是多例的，既可以创建多个不同的对象，默认为singleton单例
*
*
* */
public class UserServiceImp注解方式Demo {
    @Test
    public void Demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring/config/applicationContext2.xml");
        UserService userService =(UserService) applicationContext.getBean("userService");
        userService.ShowUserInfo();
    }
}
