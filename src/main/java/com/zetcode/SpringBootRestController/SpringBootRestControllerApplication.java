package com.zetcode.SpringBootRestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringBootRestControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestControllerApplication.class, args);
	}

}
