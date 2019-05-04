package SEDay04;

import org.junit.Test;

import java.util.Arrays;

public class ArraysDemo {
    //Arrays的sort()方法和toString()方法
    @Test
    public void ArraysDemo(){
        int [] nums={1,24,5,7,2,4,754,23,2,12};
        //sort()方法:可以对数组进行排序
        Arrays.sort(nums);
        //toString()方法可以遍历一个数组
        System.out.println(Arrays.toString(nums));

    }


}
