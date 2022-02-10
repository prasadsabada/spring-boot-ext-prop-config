package com.example.demo;
import javax.annotation.PostConstruct;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class Profiles {

	@PostConstruct
	 public void init() {
		 System.out.println("Profiles.init().......>>>>>>");
	 }
}
