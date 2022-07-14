package br.com.demo.evolucaospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.demo.evolucaospring.sevice.HelloSevice;

@RestController
public class HelloController {

	
	@Autowired
	private HelloSevice helloSevice;

	
	@GetMapping("/hello")
	public String helloworld() {
		return helloSevice.hello();
	}
	
	@GetMapping("/muitaInformacao")
	public String consulta() throws InterruptedException {
		System.out.println("request recebido");
		Thread.sleep(10000L);
		System.out.println("request processado");
		return "muitaInformacao";
	}
}
