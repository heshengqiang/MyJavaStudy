package SEDay07;
//实现Runnable接口方法来创建线程方式,该接口中就一个run()方法
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("实现接口线程方式"+i);
        }
    }
}
