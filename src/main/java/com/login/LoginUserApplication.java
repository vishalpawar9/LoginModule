package com.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = "com.login")
public class LoginUserApplication  {
	public static void main(String[] args) {
		SpringApplication.run(LoginUserApplication.class, args);
	}
	
	
}
