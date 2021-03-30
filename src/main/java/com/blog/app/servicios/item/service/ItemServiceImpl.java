package com.blog.app.servicios.item.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.blog.app.servicios.item.clients.ProductClientRest;
import com.blog.app.servicios.item.models.Item;
import com.blog.app.servicios.item.models.Product;
@Service
@Primary // no es necesario en este caso, hemos eliminado la clase que implementa 
public class ItemServiceImpl implements IItemService {

	@Autowired
	private ProductClientRest clienteFeign;
	
	@Override
	public List<Item> findAll() {
		
		return clienteFeign.list().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}
	

	@Override
	public Item findById(Long id, Integer quantity) {
	
		return new Item(clienteFeign.detail(id), quantity);
	}

}
