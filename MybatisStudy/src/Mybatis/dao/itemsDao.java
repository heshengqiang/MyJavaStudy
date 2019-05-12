package Mybatis.dao;

import Mybatis.pojo.items;

import java.util.List;

public interface itemsDao {
    public List<items> SelectAllItems();
    public int UpdateItems(items items);

}
