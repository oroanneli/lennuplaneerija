package com.example.Lennuplaneerija;

import com.example.Lennuplaneerija.repository.LennudRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LennuplaneerijaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LennuplaneerijaApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(LennudRepository lennudRepository){
		return args ->{

		};
	}

}
