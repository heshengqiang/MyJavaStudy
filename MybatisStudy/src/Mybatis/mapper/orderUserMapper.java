package Mybatis.mapper;

import Mybatis.pojo.orderUSer;
import Mybatis.pojo.orders;

import java.util.List;

public interface orderUserMapper {
    public List<orderUSer> SelectOrderAndUser();
    public List<orders> SelectOrderAndUserMap();
    public List<orders> SelectOrderUserLazingLoading();
}
