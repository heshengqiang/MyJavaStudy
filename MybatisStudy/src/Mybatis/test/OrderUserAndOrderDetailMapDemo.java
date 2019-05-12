package Mybatis.test;

import Mybatis.mapper.ordersUserAndOrderDetailMapper;
import Mybatis.pojo.orders;
import Mybatis.tools.DBhelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OrderUserAndOrderDetailMapDemo {
    @Test
    public void OrderUserAndOrderDetailMapDemo1(){
        SqlSession sqlSession = DBhelper.getSqlSession();
        ordersUserAndOrderDetailMapper mapper = sqlSession.getMapper(ordersUserAndOrderDetailMapper.class);
        List<orders> orders = mapper.SelectOrderUserAndOrderDetail();
        for (orders order : orders) {
            System.out.println(order.toString()+order.getOrderdetails());
        }
    }
}
