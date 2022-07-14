package br.com.demo.evolucaospring.sevice;

import org.springframework.stereotype.Service;

@Service
public class HelloSevice {

	
	public HelloSevice(MyConfig conf) throws InterruptedException {
		System.err.println(conf.getWait().toMillis());
		Thread.sleep(conf.getWait().toMillis());
	}
	
	public String hello() {
		return "Hello Spring";
	}

}
