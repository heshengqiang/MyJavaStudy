package SEDay07;

public class 匿名内部类ThreadDemo {
    /*
    * 匿名内部类：快速创建一个类的子类对象，或者一个接口的实现类对象
    *
    *   格式：new 父类(){
    *           重写方法();
    *   };
    *
    *   new 接口(){
    *   实现方法();
    *
    *   }
    *
    * */
    public  static void main(String args[]){
     //第一种继承方式：
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("线程"+getName()+i);
                }
            }
        }.start();
    //第二种实现方式
        /*Runnable runnable=new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i <20; i++) {
                    System.out.println("线程"+Thread.currentThread()+i);
                }
            }
        };
        new Thread(runnable).start();*/
        //改进代码
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <20; i++) {
                    System.out.println("线程"+Thread.currentThread()+i);
                }
            }
        }).start();

    }




}
