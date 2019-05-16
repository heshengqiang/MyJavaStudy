package Spring.DaoImp;

import Spring.Dao.ProductDao;
//AOP中的目标类，即这个类是需要被增强的类。
public class ProductDaoImp implements ProductDao {
    @Override
    public void InsertProduct() {
        System.out.println("商品插入成功！");
    }

    @Override
    public void DeleteProduct() {
        System.out.println("商品删除成功！");
    }

    @Override
    public void UpdateProduct() {
        System.out.println("商品修改成功！");
    }

    @Override
    public void SelectProduct() {
        System.out.println("商品信息查询！");
    }
}
