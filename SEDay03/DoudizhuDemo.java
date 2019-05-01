package SEDay03;

import org.junit.Test;

import java.util.*;

public class DoudizhuDemo {
    @Test
    public void DoudizhuDemo1(){
        //创建map集合来存储54张牌
        Map<Integer,String> map=new LinkedHashMap<>();
        //定义list集合目的是为了洗牌，用于打乱顺序
        ArrayList<Integer> list=new ArrayList<>();
        //
        int id=1;
        String [] colors={"红桃","黑桃","方块","梅花"};
        String [] nums={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //将52张普通牌放入集合中
        for (String num : nums) {
            for (String color : colors) {
                String card=color+num;
                map.put(id,card);
                list.add(id);
                id++;
            }
        }
        //加入大小王
        map.put(id,"大王");
        list.add(id);
        id++;
        map.put(id,"小王");
        list.add(id);
        //通过打乱list集合中1-54的顺序来洗牌,调用Collections中的shuffle方法
        //Collections.sort(list);//ersort方法可以把集合中的元素按自然顺序排序
        Collections.shuffle(list);
        //给三个玩家发牌(p1,p2,p3)和底牌(mo)
        ArrayList<Integer> p1=new ArrayList<>();
        ArrayList<Integer> p2=new ArrayList<>();
        ArrayList<Integer> p3=new ArrayList<>();
        ArrayList<Integer> mo=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i<=50){
                 p1.add(list.get(i));
                i++;
                p2.add(list.get(i));
                i++;
                p3.add(list.get(i));
                }
                else {
                    mo.add(list.get(i));
            }
        }
        //看牌
        System.out.println("玩家p1牌: ");
        for (Integer p1s : p1) {
            System.out.print(map.get(p1s)+" ");
        }
        System.out.println("玩家p2牌: ");
        for (Integer p1s : p2) {
            System.out.print(map.get(p1s)+" ");
        }
        System.out.println("玩家p3牌: ");
        for (Integer p1s : p3) {
            System.out.print(map.get(p1s)+" ");
        }
        System.out.println("底牌: ");
        for (Integer mos : mo) {
            System.out.print(map.get(mos)+" ");
        }
    }
}
