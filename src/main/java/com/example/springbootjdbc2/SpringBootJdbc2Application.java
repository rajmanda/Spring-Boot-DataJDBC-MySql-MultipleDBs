package com.example.springbootjdbc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringBootJdbc2Application {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbc2Application.class, args);
	}

}
