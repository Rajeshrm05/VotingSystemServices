package com.companyr.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.companyr.exception.VotingException;
import com.companyr.service.VotingSystemService;

@RestController
public class VotingSystemController {
	
@Autowired
VotingSystemService votingSystemService;

@RequestMapping("/")	
public String checkServices(){
	return "Voting Service is up...";
}

@GetMapping(value="/getCheck",produces=MediaType.APPLICATION_JSON_VALUE)
public void check(){
	System.out.println("Voting Service is up...");
	try {
		votingSystemService.checkLogin();
	} catch (VotingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}
