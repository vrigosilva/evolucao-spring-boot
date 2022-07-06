package br.com.demo.evolucaospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EvolucaoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvolucaoSpringApplication.class, args);
	}

	
	@GetMapping("/hello")
	public String helloworld() {
		return "hello Spring boot 2.3";
	}
	
}
