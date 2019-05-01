package SEDay03;

import org.junit.Test;

public class VariableDemo {
    //可变参数,指的是参数类型可变
    public static void main(String args[]){
        int sum1=add(11,12,32,34,43);

    }
    public static int add(int...a){
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        System.out.println(sum);
    return sum;
}


}
