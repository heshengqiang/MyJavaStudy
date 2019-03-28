package com.dao;

import com.entity.User;

public interface Userdao {
public void SelectAllUser() throws Exception;
public int insertUser(User user) throws Exception;
public int deleteUserById(String id) throws Exception;
public int updateUserById(User user,String id) throws Exception;
}
