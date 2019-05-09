package XMLDay01;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class Dom4jDemo {
    @Test
    public void Dom4jDemo1()throws Exception{
       //Dom解析XML文件测试
        //Dom4j提供了一个核心类，用来加载xml文档
        SAXReader saxReader = new SAXReader();
        //加载xml文件，得到一个document对象
        Document document = saxReader.read(new File("test.xml"));
        //通过document对象获得根元素标签beans
        Element rootElement = document.getRootElement();
        //通过根标签获取子标签bean
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            //遍历后获取子标签bean元素属性值
            String id = element.attributeValue("id");
            String className = element.attributeValue("className");
            System.out.println(id+"==="+className);
            List<Element> listproperty = element.elements();
            for (Element propertys : listproperty) {
                //遍历后获取子标签property的属性值
                String name = propertys.attributeValue("name");
                String value = propertys.attributeValue("value");
                System.out.println(name+"===="+value);
            }
        }
    }


}
