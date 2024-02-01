package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveUser(User user)
	{
		String sql="insert into user(name, email, password) values(?,?,?)";
		int i=jdbcTemplate.update(sql, user.getFullName(), user.getEamil(), user.getPassword());
		return i;
		
	}

}
