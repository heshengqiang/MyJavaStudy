package Mybatis.pojo;

public class orderUSer extends orders {
    private String user_acount;
    private String user_name;

    @Override
    public String toString() {
        return super.toString()+" 用户账号: "+user_acount+" 用户名: "+user_name;
    }

    public String getUser_acount() {
        return user_acount;
    }

    public void setUser_acount(String user_acount) {
        this.user_acount = user_acount;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
