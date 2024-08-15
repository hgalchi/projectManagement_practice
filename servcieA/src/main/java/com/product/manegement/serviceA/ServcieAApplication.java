package com.product.manegement.serviceA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServcieAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServcieAApplication.class, args);
	}

}
