package br.com.demo.evolucaospring.sevice;

import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("my-config")
@ConstructorBinding
public class MyConfig {
	
	private Duration wait;

	public MyConfig(@DefaultValue("0") Duration wait) {
		this.wait = wait;
	}
	
	
	public Duration getWait() {
		return wait;
	}

}
