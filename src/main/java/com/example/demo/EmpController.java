package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {


	@Autowired
	ConfigProperties env; 
	
	/*
	 * @Value(value = "${spring.country}") private String country;
	 */
	 
	@GetMapping("/")
	public String getName() {
		System.out.println("SpringbootwithMango.main()..................> name::"+env.getConfigValue("name"));
		//System.out.println("SpringbootwithMango.main()..................> country::"+country);

		return env.getConfigValue("country");
	}
}
