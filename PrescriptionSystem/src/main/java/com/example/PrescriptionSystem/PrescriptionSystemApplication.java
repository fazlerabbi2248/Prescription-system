package com.example.PrescriptionSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.example.PrescriptionSystem.repository.PrescriptionRepository;

@SpringBootApplication
public class PrescriptionSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrescriptionSystemApplication.class, args);
		
		
	}
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	
}