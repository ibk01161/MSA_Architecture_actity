package com.msa.catalogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CatalogsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogsServiceApplication.class, args);
	}

}
