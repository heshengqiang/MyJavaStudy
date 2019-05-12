package Mybatis.mapper;

import Mybatis.pojo.orders;

import java.util.List;

public interface ordersUserAndOrderDetailMapper {
    public List<orders> SelectOrderUserAndOrderDetail();
}
