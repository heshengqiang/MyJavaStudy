package com.Test;

import java.util.Scanner;

import com.dao.Userdao;
import com.daoImpl.UserdaoImpl;
import com.entity.User;

public class UserTest {
 public static void main(String args[]) throws Exception {
	 int chioce=0;
	 Scanner input=new Scanner(System.in);
	Userdao userdao=new UserdaoImpl();
	System.out.println("亲选择  1-添加  2-删除  3-修改  4-查询");
	      chioce=input.nextInt();
	switch(chioce) {
	case 1:User user1=new User("1012","王小平",20,"男","14432133","3343ds");
	       userdao.insertUser(user1);break;
	case 2:userdao.deleteUserById("1012");break;
	case 3:User user2=new User("1011","王大平",21,"男","143435533","34435fds");
	       userdao.updateUserById(user2, "1012");break;
	case 4:userdao.SelectAllUser();break;
	default:System.out.println("请输入正确选项");
	}
 }
}
