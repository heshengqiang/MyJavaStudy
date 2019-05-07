package SEDay07;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
    String name;
    //吃饭的方法
    public void eat(){
        for (int i=0;i<=20;i++){
            System.out.println(this.getName()+"正在吃第"+i+"口饭");
        }
    }
    //吃饭的方法
    public void ListenMusic(){
        for (int i=0;i<=20;i++){
            System.out.println(this.getName()+"正在听第"+i+"首歌");
        }
    }


}
