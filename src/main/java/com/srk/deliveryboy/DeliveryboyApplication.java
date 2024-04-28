package com.srk.deliveryboy;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeliveryboyApplication {

	public static void main(String[] args) {

		SpringApplication.run(DeliveryboyApplication.class, args);
		LoggerFactory.getLogger(DeliveryboyApplication.class).
				info("application deliveryboy has started");
	}

}
