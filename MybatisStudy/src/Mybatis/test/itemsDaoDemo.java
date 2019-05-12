package Mybatis.test;

import Mybatis.DaoImp.itemsDaoImp;
import Mybatis.dao.itemsDao;
import Mybatis.pojo.items;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class itemsDaoDemo {

     itemsDao itemsDao=new itemsDaoImp();

    @Test
    public void itemsDaoDemo1(){
         itemsDao.SelectAllItems();
     }

     @Test
    public  void itemsDaoDemo2(){
        items items1 = new items();
        items1.setItem_id("1");
        items1.setItem_price(5);
        itemsDao.UpdateItems(items1);
    }
}
