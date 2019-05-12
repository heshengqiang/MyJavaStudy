package Mybatis.pojo;

import javafx.scene.input.DataFormat;

import javax.xml.crypto.Data;
import javax.xml.soap.Text;
import java.text.SimpleDateFormat;
import java.util.Date;

public class items {
    private String item_id;
    private String item_name;
    private String item_intriduce;
    private int item_price;
    private String  item_detail;
    private String item_picture;
    private Date item_create;

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return "items{" +
                "item_id='" + item_id + '\'' +
                ", item_name='" + item_name + '\'' +
                ", item_intriduce='" + item_intriduce + '\'' +
                ", item_price=" + item_price +
                ", item_detail='" + item_detail + '\'' +
                ", item_picture='" + item_picture + '\'' +
                ", item_create=" + simpleDateFormat.format(this.item_create) +
                '}';
    }

    public items(){

   }
    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_intriduce() {
        return item_intriduce;
    }

    public void setItem_intriduce(String item_intriduce) {
        this.item_intriduce = item_intriduce;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public String getItem_detail() {
        return item_detail;
    }

    public void setItem_detail(String item_detail) {
        this.item_detail = item_detail;
    }

    public String getItem_picture() {
        return item_picture;
    }

    public void setItem_picture(String item_picture) {
        this.item_picture = item_picture;
    }

    public Date getItem_create() {
        return item_create;
    }

    public void setItem_create(Date item_create) {
        this.item_create = item_create;
    }
}
