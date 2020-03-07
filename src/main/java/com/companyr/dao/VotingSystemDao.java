package com.companyr.dao;

import com.companyr.exception.VotingException;

public interface VotingSystemDao {

	void checkLogin() throws VotingException;
}
