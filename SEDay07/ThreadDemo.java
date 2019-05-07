package SEDay07;

public class ThreadDemo {
    /*
    * Thread类：就是线程类
    * 构造：public Thread();//创建一个默认名称的线程
    *       public Thread(String name);//创建一个指定名称的线程
    * 创建线程方式1：继承方式
    * 1 class myThread extends Thread {
    *     run(){
    *     任务代码
    *     }
    *  }
    *  myThread mt=new myThread();
    *  mt.start();
    *
    * 创建线程方式2：实现方式
    * class myRunnable implements Runnable{
    *  run(){
    *  任务代码
    *  }
    * }
    * myRunnable mr=new myRunnable();
    * Thread th=new Thread(mr);
    * th.start();
    *  从耦合性分析：第一种方式，线程和任务是在一个模块的，耦合性高。
    *               第二种方式，线程和任务分开，耦合性低。
    *
    *  从代码扩展性分析：第一种方式，由于是继承方式，所以该类就不能继承其他类。
    *                   第二种方式，由于是实现接口，所以还可以继承其他类。
    *
    *
    *   分析得知结论：第二种方式更好，耦合性低，可扩展性强。
    * */
    public static void main(String args[]){
        MyThread mt=new MyThread();
        mt.start();
        for (int i=0;i<100;i++){
            System.out.println("main线程"+i);
        }

    }


}
