package br.com.demo.evolucaospring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;

@SpringBootApplication
@ConfigurationPropertiesScan
public class EvolucaoSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(EvolucaoSpringApplication.class, args);
		
//		SpringApplication app = new SpringApplication(EvolucaoSpringApplication.class);
//		app.setApplicationStartup(new FlightRecorderApplicationStartup());
//		app.run(args);
		
		new SpringApplicationBuilder(EvolucaoSpringApplication.class)
//			.applicationStartup(new FlightRecorderApplicationStartup())
			.applicationStartup(new BufferingApplicationStartup(10000))
			.environmentPrefix("evolucao")
			.run(args);
	}


}
