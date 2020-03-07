package com.companyr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyr.dao.VotingSystemDao;
import com.companyr.exception.VotingException;
import com.companyr.service.VotingSystemService;

@Service
public class VotingSystemServiceImpl implements VotingSystemService {
	
@Autowired
public VotingSystemDao votingSystemDao;
@Override
	public void checkLogin() throws VotingException{
		try{
			votingSystemDao.checkLogin();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
