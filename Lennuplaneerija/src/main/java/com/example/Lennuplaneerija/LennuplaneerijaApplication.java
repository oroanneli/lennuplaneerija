package com.example.Lennuplaneerija;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LennuplaneerijaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LennuplaneerijaApplication.class, args);

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}


}
