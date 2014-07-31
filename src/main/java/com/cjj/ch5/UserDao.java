package com.cjj.ch5;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

@SuppressWarnings("deprecation")
public class UserDao {
	private SimpleJdbcTemplate jdbcTemplate;

	public SimpleJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void addUsers(Users addobj){
		jdbcTemplate.update("insert into users(username,passwd,email,grade) VALUES(?,?,?,?)", 
				addobj.getUsername(),
				addobj.getPasswd(),
				addobj.getEmail(),
				addobj.getGrade());
	}
}
