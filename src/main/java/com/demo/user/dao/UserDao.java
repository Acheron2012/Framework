package com.demo.user.dao;

import com.demo.bean.UserBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
	
		@Select("select * from user where username = #{username}")
	 	public UserBean selectUser(UserBean user); 
	 	
	 	@Insert("insert into user(username, password) values(#{username}, #{password})")  
	    public void insertUser(UserBean user);  
	    /* public void updateUser(User user);  
	    public void deleteUser(int userId);*/  
}
