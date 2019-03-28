package com.entity;

public class User {
	    private String user_id;
	    private String user_name;
	    private int user_age;
	    private String user_sex;
	    private String user_acount;
	    private String user_password;
	    public User() {
	    	
	    }
	    public User(String user_id, String user_name, int user_age, String user_sex, String user_acount,
				String user_password) {
			super();
			this.user_id = user_id;
			this.user_name = user_name;
			this.user_age = user_age;
			this.user_sex = user_sex;
			this.user_acount = user_acount;
			this.user_password = user_password;
		}
		public String toString(){
	        return " 用户id: "+getUser_id()+" 姓名: "+getUser_name()+" 年龄: "+getUser_age()+" 性别: "+getUser_sex()+" 账号: "+getUser_acount()+" 密码: "+getUser_password();
	     }
		public String getUser_id() {
			return user_id;
		}
		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public int getUser_age() {
			return user_age;
		}
		public void setUser_age(int user_age) {
			this.user_age = user_age;
		}
		public String getUser_sex() {
			return user_sex;
		}
		public void setUser_sex(String user_sex) {
			this.user_sex = user_sex;
		}
		public String getUser_acount() {
			return user_acount;
		}
		public void setUser_acount(String user_acount) {
			this.user_acount = user_acount;
		}
		public String getUser_password() {
			return user_password;
		}
		public void setUser_password(String user_password) {
			this.user_password = user_password;
		}

}
