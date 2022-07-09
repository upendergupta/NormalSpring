package com.microservice;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NormalSpringApplicationTests {
	
	public static Logger log=LoggerFactory.getLogger(NormalSpringApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Test Executed Successfully..................");
		//assertEquals();
	}

}
