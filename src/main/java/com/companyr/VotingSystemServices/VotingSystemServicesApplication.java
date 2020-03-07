package com.companyr.VotingSystemServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.companyr.controller","com.companyr.service","com.companyr.dao"})
public class VotingSystemServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotingSystemServicesApplication.class, args);
	}

}
