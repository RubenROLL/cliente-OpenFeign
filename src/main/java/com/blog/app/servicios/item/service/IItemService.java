package com.blog.app.servicios.item.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.app.servicios.item.models.Item;

public interface IItemService {
	
	public List<Item> findAll();
	public Item findById(Long id, Integer quantity);

}
