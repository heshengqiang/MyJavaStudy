package com.mybatis.knowledgeDay01;
//构建类
public class TicketBuilder {
    public static Object builder(TicketHelper helper) {
        System.out.println("通过TicketHelper构建套票信息:");
        return null;
    }

    public static void main(String args[])
    {
        //构建套票对象
        TicketHelper helper = new TicketHelper();
        helper.builderAdult("成人票");
        helper.builderChildrenForSeat("有座儿童");
        helper.builderChildrenNoSeat("无座儿童");
        helper.builderOlder("老人票");
        helper.builderSolder("军人票");
        Object builder = TicketBuilder.builder(helper);
        System.out.println(builder);


    }
}
