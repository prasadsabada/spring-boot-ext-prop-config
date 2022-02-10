package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class SpringbootwithMango {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithMango.class, args);
	}

	/*
	 * @Bean public PropertySourcesPlaceholderConfigurer
	 * propertySourcesPlaceholderConfigurer() { PropertySourcesPlaceholderConfigurer
	 * properties = new PropertySourcesPlaceholderConfigurer();
	 * properties.setLocation(new
	 * FileSystemResource("E:\\prasad\\workspace\\demo\\demo.properties"));
	 * properties.setIgnoreResourceNotFound(false);
	 * properties.getAppliedPropertySources().get("name"); return properties; }
	 */
}
