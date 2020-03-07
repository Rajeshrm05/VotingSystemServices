package com.companyr.service;

import org.springframework.stereotype.Service;

import com.companyr.exception.VotingException;

@Service
public interface VotingSystemService {
	public void checkLogin() throws VotingException;
}
