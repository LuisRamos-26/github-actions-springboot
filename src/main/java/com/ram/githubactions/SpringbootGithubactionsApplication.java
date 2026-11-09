package com.ram.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGithubactionsApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Hi!, Welcome to Spring Boot Github Actions";
	}

	@GetMapping("/saludar")
	public String saludar() {
		return "Comparte este video en Linkedin";
	}

	@GetMapping("/compartir")
	public String compartir() {
		return "Comparte este video en Linkedin con tus amigos";
	}



	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubactionsApplication.class, args);
	}

}
