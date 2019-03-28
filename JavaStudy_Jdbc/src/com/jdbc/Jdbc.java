package com.jdbc;

import java.sql.*;

public class Jdbc {
	    private static final String url="jdbc:mysql://localhost:3306/goodsmanager";
	    private static final String Driver="com.mysql.jdbc.Driver";
	    private static final String username="root";
	    private static final String password="123456";
	    private static  Connection connection=null;
	    static {
	    try {
	    Class.forName(Driver);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    }
	    public static Connection getConnection() throws Exception{
           connection=DriverManager.getConnection(url, username, password);
	       return connection;
	    }
	    
}
