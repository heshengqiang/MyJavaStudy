package Spring.Pojo;

import java.util.Date;

public class Items {
    private String item_id;
    private String item_name;
    private int item_price;
    private Date item_create;
    public Items(){

    }
    @Override
    public String toString() {
        return "Items{" +
                "item_id='" + item_id + '\'' +
                ", item_name='" + item_name + '\'' +
                ", item_price='" + item_price + '\'' +
                ", item_create=" + item_create +
                '}';
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

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public Date getItem_create() {
        return item_create;
    }

    public void setItem_create(Date item_create) {
        this.item_create = item_create;
    }
}
