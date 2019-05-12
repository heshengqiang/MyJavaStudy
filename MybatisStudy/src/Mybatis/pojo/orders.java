package Mybatis.pojo;

import java.util.Date;
import java.util.List;

public class orders {
    private String user_id;
    private String   order_id;
    private Date order_time;
    private String order_action;
    private String order_num;
    private String  note;
    private user user;

    public List<orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    private List<orderdetail> orderdetails;
    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public  orders(){

   }
    @Override
    public String toString() {
        return "orders{" +
                "user_id='" + user_id + '\'' +
                ", order_id='" + order_id + '\'' +
                ", order_time=" + order_time +
                ", order_action='" + order_action + '\'' +
                ", order_num='" + order_num + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public String getOrder_action() {
        return order_action;
    }

    public void setOrder_action(String order_action) {
        this.order_action = order_action;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
