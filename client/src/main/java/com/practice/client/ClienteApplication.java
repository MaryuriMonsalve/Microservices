package com.practice.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableEurekaClient
@EnableSwagger2
@ComponentScan("com.practice.cliente.dto.IClientMapper")
@SpringBootApplication
public class ClienteApplication{

	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}

}
