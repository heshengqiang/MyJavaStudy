package SEDay07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 解决线程不安全问题方式1：
 * 给代码加上同步锁
 * 格式：
 * synchronized(锁对象){
 *          代码
 *           }
 *           锁对象可以是任意对象
 *
 * 解决线程不安全问题的方式2：
 * 同步方法机制
 * 格式：
 * public synchronized void 方法名(){
 *      }
 *
 * 解决线程不安全的问题方式3：
 * Lock接口方式
 * 实际上使用的是继承ReentrantLock类
 *
 *
 * */
public class SaleThread implements Runnable{

    //方式一
     /* private int count=100;
      private Object object=new Object();
    @Override
    public void run() {
        synchronized(object){
        while (true){
            if(count>0){
                try {
                   Thread.sleep(50);
                }catch (Exception e){
                }
                System.out.println("卖出第"+count+"票");
                count--;

            }
        }
    }
    }*/
    //方式二:同步方法机制，也是用锁对象，但是调用的是this对象
    /* private int count=1000;
    @Override
    public void run() {
       while (true) {
           sale();
       }
    }
    public synchronized void sale(){
        if(count>0){
            try {
                Thread.sleep(0);
            }catch (Exception e){
            }
            System.out.println("卖出第"+count+"票");
            count--;
        }
    }*/
    /*
    解决线程不安全的问题方式3:Lock接口方式,实际上使用的是继承ReentrantLock类
    * 创建ReentrantLock的对象
    * Lock接口方法：
    * lock();//获得锁
    * unlock();//尝试释放此锁
    *
    * */
    private int count=1000;
    private Object object=new Object();
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
            while (true) {
                lock.lock();//获得锁
                if (count > 0) {
                    try {
                        Thread.sleep(0);
                    } catch (Exception e) {
                    }
                    System.out.println("卖出第" + count + "票");
                    count--;
                }
                lock.unlock();//释放锁
            }
    }



    }

