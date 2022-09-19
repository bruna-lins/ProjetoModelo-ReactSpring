package com.cadastro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.cadastro.model.entity"})
@EnableJpaRepositories(basePackages = {"com.cadastro.repository"})
@ComponentScan(basePackages = {"com.cadastro.controller", "com.cadastro.serviceImpl"})
@SpringBootApplication
public class ProjetoModeloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoModeloApplication.class, args);
	}

}
