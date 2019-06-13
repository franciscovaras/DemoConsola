package com.example.demo;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.service.IPersonaService;


// para trabajar en consolola se debe implementar CommandLineRunner

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {
	
	private static Logger LOG = (Logger) LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Autowired
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub Se debe crear este método para trabajar en consola
		//System.out.println("Hola a todos");
		//LOG.info("Hola Mundo");
		//service = new PersonaServiceImpl();
		service.Registrar("MitoCode");
		
	}
	
	
}
