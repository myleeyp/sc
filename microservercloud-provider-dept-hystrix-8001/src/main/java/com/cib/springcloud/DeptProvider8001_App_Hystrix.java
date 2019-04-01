package com.cib.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class DeptProvider8001_App_Hystrix {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_App_Hystrix.class, args);
	}
}
