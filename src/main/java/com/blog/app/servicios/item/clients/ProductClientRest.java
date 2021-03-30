package com.blog.app.servicios.item.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.blog.app.servicios.item.models.Product;

@FeignClient(name="servicio-productos", url="localhost:8081")
public interface ProductClientRest {
	
	@GetMapping("/listar")
	public List<Product> list();
	
	@GetMapping("/ver/{id}")
	public Product detail(@PathVariable Long id);
}
