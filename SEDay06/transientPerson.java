package SEDay06;

import java.io.Serializable;
//Serializable实现这个接口就是一个标记作用，接口里面没有东西
public class transientPerson implements Serializable {
    @Override
    public String toString() {
        return "transientPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public transientPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    transient int age;
}
