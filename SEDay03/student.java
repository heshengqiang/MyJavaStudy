package SEDay03;

public class student {
    public student(){

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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    String name;
    int age;
    int grade;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", grade=" + grade +
                '}';
    }
}
