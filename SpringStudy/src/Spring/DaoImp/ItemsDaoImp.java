package Spring.DaoImp;

import Spring.Dao.ItemsDao;
import Spring.Pojo.Items;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ItemsDaoImp implements ItemsDao {
    @Resource(name = "jdbcTemplate")//注入jdbc模板对象
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Items> FindAllItems() {
        List<Items> itemsList = jdbcTemplate.query("select item_name,item_id,item_price,item_create from items ", new MyRowMapper());
        for (Items items : itemsList) {
            System.out.println(items.toString());
        }
        return itemsList;
    }

    class MyRowMapper implements RowMapper<Items> {
        public Items mapRow(ResultSet rs, int rowNum) throws SQLException {
            Items items = new Items();
            items.setItem_name(rs.getString("item_name"));
            items.setItem_id(rs.getString("item_id"));
            items.setItem_price(rs.getInt("item_price"));
            items.setItem_create(rs.getDate("item_create"));
            return items;
        }
    }
}
