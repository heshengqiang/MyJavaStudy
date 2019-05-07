package SEDay07;

public class RunableDemo {
    /*
     *实现Runnable接口创建线程的方式：
     * 1.定义类实现Runnable接口
     * 2.实现类重写run方法
     * 3.创建实现类对象
     * 4.创建Thread对象，并将实现类对象作为参数传递给Thread对象
     * 5.启动Thread对象，即启动线程
     */
    public static void main(String args[]){
        //3.创建实现类对象
        MyRunnable myRunnable=new MyRunnable();
        //4.创建Thread对象，并将实现类对象作为参数传递给Thread对象
        // myRunnable对象理解为任务对象
        Thread thread=new Thread(myRunnable);
        //5.启动Thread对象，即启动线程
        thread.start();
        for (int i=0;i<100;i++){
            System.out.println("main线程"+i);
        }
       //由于线程调度问题，使得每次运行结果是不一样的，具有不确定性

    }






}
