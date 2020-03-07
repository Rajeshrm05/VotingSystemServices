package com.companyr.exception;

public class VotingException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public VotingException(Exception exception){
		super(exception);
	}
	
	public VotingException(String msg){
		super(msg);
	}
	
	public VotingException(String msg,Exception exception){
		super(msg,exception);
	}
	
}
