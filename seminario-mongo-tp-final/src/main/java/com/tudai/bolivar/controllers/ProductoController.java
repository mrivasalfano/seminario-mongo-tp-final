package com.tudai.bolivar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tudai.bolivar.models.Producto;
import com.tudai.bolivar.repositories.ProductoRepository;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	private ProductoRepository repository;
	
	@GetMapping("/")
    public Iterable<Producto> getProducto() {
    	return repository.findAll();
    }
}
