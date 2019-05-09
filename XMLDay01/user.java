package XMLDay01;

public class user {
    String userName;
    int age;

    public user(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
