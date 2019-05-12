package Mybatis.tools;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DBhelper {
    public  static SqlSessionFactory sessionFactory;

    //使用MyBatis提供的Resources类加载mybatis的配置文件
    static {
        try {
            Reader resourceAsReader = Resources.getResourceAsReader("Mybatis/config/mybatisConfig.xml");
            //加载xml文件，构建sqlSession的工厂
            sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //创建能执行映射文件中sql的sqlSession
    public static SqlSession getSqlSession(){
        return sessionFactory.openSession();

    }
}
