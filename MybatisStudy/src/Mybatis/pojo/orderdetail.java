package Mybatis.pojo;

public class orderdetail {
    private String order_id;
    private String item_id;
    private int item_amount;
    private int detail_id;

    @Override
    public String toString() {
        return "orderdetail{" +
                "order_id='" + order_id + '\'' +
                ", item_id='" + item_id + '\'' +
                ", item_amount=" + item_amount +
                ", detail_id=" + detail_id +
                '}';
    }

    public orderdetail(){

    }
    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public int getItem_amount() {
        return item_amount;
    }

    public void setItem_amount(int item_amount) {
        this.item_amount = item_amount;
    }

    public int getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(int detail_id) {
        this.detail_id = detail_id;
    }
}
