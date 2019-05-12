package Mybatis.DaoImp;

import Mybatis.dao.itemsDao;
import Mybatis.pojo.items;
import Mybatis.tools.DBhelper;
import org.apache.ibatis.session.SqlSession;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class itemsDaoImp implements itemsDao {
    @Override
    public List<items> SelectAllItems(){
        SqlSession sqlSession = DBhelper.getSqlSession();
        List<items> list = sqlSession.selectList("DaoTest.SelectAllItems");
        Iterator<items> iterator = list.iterator();
        while (iterator.hasNext()){
            items item = iterator.next();
            System.out.println(item.toString());
        }
        return list;
    }

     @Override
    public int UpdateItems(items items) {
        try{
        SqlSession sqlSession = DBhelper.getSqlSession();
        int update = sqlSession.update("DaoTest.UpdateItems",items);
        if (update>0){
            sqlSession.commit();
            System.out.println("修改价格成功!");
        }else {
            System.out.println("修改价格失败!可能商品不存在");
        }}catch (Exception e){
            System.out.println("修改价格失败!");
        }
        return 0;
    }
}
