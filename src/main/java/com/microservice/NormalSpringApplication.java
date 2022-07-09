package com.microservice;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NormalSpringApplication {
	public static Logger log=LoggerFactory.getLogger(NormalSpringApplication.class);
	@PostConstruct
	public void ram(){
		log.info("Application Started......");
	}
	public static void main(String[] args) {
		log.info("Application executed......");
		SpringApplication.run(NormalSpringApplication.class, args);
	}

}
