package Spring.Pojo;

public class user {
    public user(){

    }
    @Override
    public String toString() {
        return "user{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_age=" + user_age +
                ", user_sex='" + user_sex + '\'' +
                ", user_acount='" + user_acount + '\'' +
                ", user_password='" + user_password + '\'' +
                '}';
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_acount() {
        return user_acount;
    }

    public void setUser_acount(String user_acount) {
        this.user_acount = user_acount;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    private String user_id;
    private String user_name;
    private int user_age;
    private String user_sex;
    private String user_acount;
    private String user_password;
}
