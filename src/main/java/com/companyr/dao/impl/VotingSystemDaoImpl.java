package com.companyr.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.companyr.dao.VotingSystemDao;
import com.companyr.exception.VotingException;

@Repository
public class VotingSystemDaoImpl implements VotingSystemDao {
	
@Autowired
@Qualifier("joJdbcTemplate")
private JdbcTemplate jdbcTemplate;
	
@Override
public void checkLogin() throws VotingException{
	
	try{
		System.out.println("VotingSystemDaoImpl");
		//jdbcTemplate.query("",new Object[]{},new BeanPropertyRowMapper(mappedClass);
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
}
}
