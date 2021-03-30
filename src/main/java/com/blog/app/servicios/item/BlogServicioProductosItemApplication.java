package com.blog.app.servicios.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BlogServicioProductosItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogServicioProductosItemApplication.class, args);
	}

}
