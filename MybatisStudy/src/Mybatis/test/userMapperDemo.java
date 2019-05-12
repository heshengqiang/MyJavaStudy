package Mybatis.test;

import Mybatis.mapper.userMapper;
import Mybatis.pojo.user;
import Mybatis.tools.DBhelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class userMapperDemo {
    public  static void main(String args[]){

        //UpdateUserPasswordById();
        //DeleteUserById();
    }
    @Test
        public void InsertUserDemo(){
        try{SqlSession sqlSession = DBhelper.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        user user1=new user("1020","光头强",19,"男","3724874","7234738");
        int i = mapper.InsertUser(user1);
        sqlSession.commit();//更新删除修改必须要进行事务提交操作
        if(i>0){
            System.out.println(user1.getUser_name()+"插入用户成功!");
        }}catch (Exception e){
            System.out.println("数据插入失败,可能是数据已经存在");
        }
    }
    @Test
    public void SelectUserByIdDemo(){
        SqlSession sqlSession = DBhelper.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        user user = mapper.SelectUserById("1001");
        System.out.println(user.toString());
    }
    @Test
    public static void DeleteUserById(){
        try {
        SqlSession sqlSession=DBhelper.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        System.out.println("请输入要删除的用户: ");
        Scanner input = new Scanner(System.in);
        String user_id=input.next();
        int i = mapper.DeleteUserById(user_id);
        sqlSession.commit();
        if (i>0){
            System.out.println("删除用户成功!");
        }
    }catch (Exception e){
            System.out.println("删除用户失败,可能用户不存在!");
        }
    }
    public static void UpdateUserPasswordById(){
        try {
            user user1=new user();
            SqlSession sqlSession=DBhelper.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        System.out.println("请输入要修改用户的id:");
        Scanner input = new Scanner(System.in);
        user1.setUser_id(input.next());
        System.out.println("请输入新密码: ");
        String user_password1=input.next();
        System.out.println("再次输入新密码: ");
        String user_password2=input.next();
        if(user_password1.equals(user_password2)){
            user1.setUser_password(user_password2);
            int i = mapper.UpdateUserPasswordById(user1);
            sqlSession.commit();
            if (i>0){
                System.out.println("密码修改成功!");
            }else {
                System.out.println("密码修改失败!可能您要修改用户不存在");
            }
        }else {
            System.out.println("两次密码不一致!");
           UpdateUserPasswordById();
        }
    }catch (Exception e){
            System.out.println("修改失败!可能您要修改用户不存在");
        }
    }
}
