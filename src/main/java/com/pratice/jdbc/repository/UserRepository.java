package com.pratice.jdbc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	/* we are autowiring jdbc tempelate using the properties we have configured in 
	 * application.properties spring automatically detects and creates jdbc template 
	 * object the configuration 
	 */
	
	@Autowired
	JdbcTemplate jdbcTemplate;

//	return list of user name
	
	public List<String> getAllUserName() {
	    List<String> usernameList = new ArrayList<String>();
	   usernameList.addAll(jdbcTemplate.queryForList("select name from user;", String.class));
		return usernameList;
	}

}
