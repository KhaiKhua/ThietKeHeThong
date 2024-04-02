package com.ontap.ontap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OntapApplication {

	public static void main(String[] args) {
		SpringApplication.run(OntapApplication.class, args);
	}

}
