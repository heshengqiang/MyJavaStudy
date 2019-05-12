package Mybatis.test;

import Mybatis.mapper.orderUserMapper;
import Mybatis.pojo.orderUSer;
import Mybatis.pojo.orders;
import Mybatis.tools.DBhelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

public class orderUserDemo {



    /*使用扩展类进行多表查询的测试*/
    @Test
    public void orderUserDemo1(){
        SqlSession sqlSession = DBhelper.getSqlSession();
        orderUserMapper mapper = sqlSession.getMapper(orderUserMapper.class);
        List<orderUSer> list = mapper.SelectOrderAndUser();
        //这里使用集合的迭代器遍历
        Iterator<orderUSer> iterator = list.iterator();
        while(iterator.hasNext()){
            orderUSer orderUSer = iterator.next();
            System.out.println(orderUSer.toString());
        }
    }




    /*使用resultMap方式进行多表查询的测试*/
    @Test
    public void orderUserDemo2(){
        SqlSession sqlSession = DBhelper.getSqlSession();
        orderUserMapper mapper = sqlSession.getMapper(orderUserMapper.class);
        List<orders> list = mapper.SelectOrderAndUserMap();
        //这里使用增强for循环进行遍历,底层就是迭代器原理
        for (orders orders : list) {
            System.out.println(orders.toString()+orders.getUser().toString());
        }
    }




    /*查询订单关联查询用户，用户延迟加载*/
    @Test
    public void orderUserDemo3(){
        SqlSession sqlSession = DBhelper.getSqlSession();
        orderUserMapper mapper = sqlSession.getMapper(orderUserMapper.class);
        List<orders> list = mapper.SelectOrderUserLazingLoading();
        //这里使用增强for循环进行遍历,底层就是迭代器原理
        for (orders orders : list) {
            //这里就是查询订单的同时还要查询用户
            //System.out.println(orders.toString()+orders.getUser());


            //这里就是只需对订单信息进行查询即可，不需要查询用户信息，就不要再去数据库中查询用户表了
            System.out.println(orders.toString());



            /*也可以是只需要要查询用户信息，订单信息不查询，但是原理还是先查询了订单表中的数据，再将数据
            传给了查询用户的statement执行实现的，也就是相当于查询订单关联查询了用户，只是订单信息没有打印出来*/
            //System.out.println(orders.getUser());
        }
    }
}
