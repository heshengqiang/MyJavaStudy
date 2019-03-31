package com.daoImpl;

import java.sql.*;

import com.dao.Userdao;
import com.entity.User;
import com.jdbc.Jdbc;

public class UserdaoImpl implements Userdao {

	   public void SelectAllUser() throws Exception {
		Jdbc jdbc=new Jdbc();
		User user=new User();
		Connection connection=jdbc.getConnection();
		String sql="select *from user";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultset= preparedStatement.executeQuery();
		while(resultset.next()) {
			user.setUser_id(resultset.getString("user_id"));
			user.setUser_name(resultset.getString("user_name"));
			user.setUser_age(resultset.getInt("user_age"));
			user.setUser_acount(resultset.getString("user_acount"));
			user.setUser_password(resultset.getString("user_password"));
			user.setUser_sex(resultset.getString("user_sex"));
			System.out.println(user.toString());
		}
		resultset.close();
		preparedStatement.close();
		connection.close();
	}


	public int insertUser(User user) throws Exception {
		Jdbc jdbc=new Jdbc();
		Connection connection=jdbc.getConnection();
		String sql="insert into user(user_id,user_name,user_age,"
				+ "user_acount,user_password,user_sex)values(?,?,?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,user.getUser_id());
		preparedStatement.setString(2,user.getUser_name());
		preparedStatement.setInt(3,user.getUser_age());
		preparedStatement.setString(4,user.getUser_acount());
		preparedStatement.setString(5,user.getUser_password());
		preparedStatement.setString(6,user.getUser_sex());
        int resultset=preparedStatement.executeUpdate();
        if(resultset>0) {
        	System.out.println(user.getUser_name()+"添加成功！");
        }
		preparedStatement.close();
		connection.close();
		return resultset;
	}


	@Override
	public int deleteUserById(String id) throws Exception {
		Jdbc jdbc=new Jdbc();
		Connection connection=jdbc.getConnection();
		String sql="delete from user where user_id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,id);
		int result=preparedStatement.executeUpdate();
		if(result>0) {
        	System.out.println(id+"用户删除成功！");
        }
		preparedStatement.close();
		connection.close();
		return result;
	}


	@Override
	public int updateUserById(User user, String id) throws Exception {
		Jdbc jdbc=new Jdbc();
		Connection connection=jdbc.getConnection();
			String sql="update user set user_id=?,user_name=?,user_age=?,user_acount=?,"
					+ "user_password=?,user_sex=? where user_id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,user.getUser_id());
			preparedStatement.setString(2,user.getUser_name());
			preparedStatement.setInt(3,user.getUser_age());
			preparedStatement.setString(4,user.getUser_acount());
			preparedStatement.setString(5,user.getUser_password());
			preparedStatement.setString(6,user.getUser_sex());
			preparedStatement.setString(7,id);
			int resultset=preparedStatement.executeUpdate();
			if(resultset>0) {
				System.out.println(user.getUser_name()+"用户更新成功！");
			}else {
				System.out.println(id+"用户不存在！");
			}
			preparedStatement.close();
			connection.close();
		return 0;
	}

}
