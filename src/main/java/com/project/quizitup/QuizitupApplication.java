package com.project.quizitup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.project.quizitup.model")
public class QuizitupApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizitupApplication.class, args);
	}

}
