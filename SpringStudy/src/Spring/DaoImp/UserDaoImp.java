package Spring.DaoImp;
//使用注解开发
import Spring.Dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

// Dao层使用@Repository来将这个类交给Spring管理，即这里相当于bean的配置
@Repository(value="userDao")
//这样配置就不用在xml中配置<bean id="userDao" class="com.Dao.UserDaoImp" />这个了就相当于bean配置作用
public class UserDaoImp implements UserDao {
    @Value("贺圣强")//相当于xml中的property属性注入
    private String name;
    public void ShowUserInfo() {
        System.out.println("Dao层学生姓名："+name);
    }
}
