package com.example.edgeservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.edgeservice.model.Item;

import org.springframework.hateoas.CollectionModel;
@FeignClient("item-catalog-service")
public interface ItemClient {
	
	@GetMapping("/items")
	CollectionModel<Item> readItems();

}
