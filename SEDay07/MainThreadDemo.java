package SEDay07;

public class MainThreadDemo {
    /*
    * 进程：运行中的程序。一个进程至少有一个线程，有多个线程的进程叫多线程程序
    * 线程：进程的一个小任务，即进程的一个执行单元。
    * 程序运行原理：
    * 分时调度：所有线程平均分配cpu使用权，即使用cpu时间都相同
    * 抢占式调度：优先让优先级高的线程占用cpu，优先级相同则随机选择线程（随机性）
    *
    * */


    //main方法所在的线程叫主线程
    public static void main(String args[]){
        Person person=new Person("张三");
        person.eat();
        person.ListenMusic();
        //这个时候执行顺序一定是从上至下的


    }




}
