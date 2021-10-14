package com.example.m2restdataJPAalvarogarcia;

import com.example.m2restdataJPAalvarogarcia.repository.InmuebleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class M2RestDataJpaAlvaroGarciaApplication {

	//Repository call
	//@Autowired
	//InmuebleRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(M2RestDataJpaAlvaroGarciaApplication.class, args);
	}

}
