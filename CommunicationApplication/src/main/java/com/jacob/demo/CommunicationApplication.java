package com.jacob.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;

@SpringBootApplication
public class CommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunicationApplication.class, args);
	}

}
