package Mybatis.mapper;

import Mybatis.pojo.user;

public interface userMapper {
    public int InsertUser(user user);
    public user SelectUserById(String user_id);
    public int DeleteUserById(String user_id);
    public int UpdateUserPasswordById(user user);
}
