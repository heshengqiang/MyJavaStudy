package SEDay04;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapMapDemo {
    @Test
    public void MapMapDemo(){
        Map<String ,String > map1= new LinkedHashMap<>();
        map1.put("001","aaa");
        map1.put("002","bbb");
        map1.put("003","ccc");
        Map<String ,String > map2= new LinkedHashMap<>();
        map2.put("001","ddd");
        map2.put("002","eee");
        map2.put("003","fff");
        Map<String ,String > map3= new LinkedHashMap<>();
        map3.put("001","rrr");
        map3.put("002","qqq");
        map3.put("003","yyy");
        //将三个map集合放在一个集合中,即集合中套集合
        Map<String ,Map<String ,String >> mapMap=new LinkedHashMap<>();
        mapMap.put("map1",map1);
        mapMap.put("map2",map2);
        mapMap.put("map3",map3);
        //遍历mapMap集合keySet
        Set<String> strings = mapMap.keySet();
        for (String string : strings) {
            System.out.println(string);
            Map<String, String> stringStringMap = mapMap.get(string);
            System.out.println(stringStringMap);

        }
        //遍历mapMap集合中的元素包括子Map也遍历  entrySet
        Set<Map.Entry<String, Map<String, String>>> entries = mapMap.entrySet();
        for (Map.Entry<String, Map<String, String>> entry : entries) {
            Map<String, String> value = entry.getValue();
            Set<Map.Entry<String, String>> entries1 = value.entrySet();
            for (Map.Entry<String, String> stringStringEntry : entries1) {
                String value1 = stringStringEntry.getValue();
                System.out.println(value1);
            }
        }
    }
}
