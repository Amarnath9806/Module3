package com.example.TDSApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.cg.TDSApp.mycontroller")
@ComponentScan("com.cg.TDSApp.dao")
@ComponentScan("com.cg.TDSApp.service")
@ComponentScan("com.cg.TDSApp.model")
@EntityScan(basePackages = {"com.cg.TDSApp.model"})
@SpringBootApplication
public class TdsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TdsAppApplication.class, args);
	}

}
