package com.miniproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.miniproject"})
@MapperScan(basePackages = {"com..miniproject"})
public class MiniprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniprojectApplication.class, args);
	}

}
