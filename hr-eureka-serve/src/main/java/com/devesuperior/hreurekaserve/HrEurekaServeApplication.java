package com.devesuperior.hreurekaserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrEurekaServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrEurekaServeApplication.class, args);
	}

}
