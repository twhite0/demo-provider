package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

//Removing code to test Pull

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages="com.example.endpoint")
public class RegistryProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryProviderApplication.class, args);
	}
}
