package Spring.DaoImp;

import Spring.Dao.OrderDao;

public class OrderDaoImp implements OrderDao {
    @Override
    public void save() {
        System.out.println("save Order...");
    }

    @Override
    public void find() {
        System.out.println("find Order...");
    }

    @Override
    public void update() {
        System.out.println("update Order...");
    }

    @Override
    public String  delete() {
        System.out.println("delete Order...");
        return "后置通知获取返回值";
    }
}
