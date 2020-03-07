package com.companyr.dao.impl;

import org.springframework.stereotype.Repository;

import com.companyr.dao.VotingSystemDao;
import com.companyr.exception.VotingException;

@Repository
public class VotingSystemDaoImpl implements VotingSystemDao {
	
@Override
public void checkLogin() throws VotingException{
	
	try{
		System.out.println("VotingSystemDaoImpl");
	}catch(Exception e){
		e.printStackTrace();
	}
	
}
}
