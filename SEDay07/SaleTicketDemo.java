package SEDay07;

public class SaleTicketDemo {
    /*
     *线程安全问题：多个线程同时运行，操作同一个数据，
     *这个时候可能会出现线程安全问题，即线程不安全问题
     */

    //案例：电影院卖票问题，票数100张(理解为共享数据)，总共3个柜台(理解为3个线程)在卖这100张票
    public static void main(String args[]){
    //创建卖票任务对象
        SaleThread st=new SaleThread();
        Thread th1=new Thread(st);
        th1.start();
        Thread th2=new Thread(st);
        th2.start();
        Thread th3=new Thread(st);
        th3.start();
        //测试发现多线程操作共享数据时的不安全问题
        /*
        * 解决线程不安全问题方式1：
        * 给代码加上同步锁
        * 格式：
        * synchronized(锁对象){
        *          代码
        *           }
        *           锁对象可以是任意对象
        *
        * */
        //改进后测试发现问题解决


   }




}
