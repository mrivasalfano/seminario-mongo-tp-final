package com.tudai.bolivar.controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Iterable<Producto> getProductos() {
    	return repository.findAll();
    }
	
	@GetMapping("/{id}")
    public Producto getProducto(@PathVariable String id, HttpServletResponse response) {
    	Optional<Producto> prod = repository.findById(id);
    	
    	if (prod.isPresent()) {
    		response.setStatus(200);
    		return prod.get();
    	}
    	
    	response.setStatus(404);
    	return null;
    }
	
	@PostMapping("/")
	public Producto addProducto(Producto p) {
		return repository.save(p);
	}
	
	@DeleteMapping("/{id}")
	public Producto deleteProducto(@PathVariable String id, HttpServletResponse response) {
		Optional<Producto> prod = repository.findById(id);
		if( prod.isPresent() ) {
			repository.deleteById(id);  
			response.setStatus(200);
			return prod.get();
		}
		
		response.setStatus(404); 			
		return null;
	}
	
	@PutMapping("/")
	public Producto updateProducto(@RequestBody Producto newProd, HttpServletResponse response) {
		Producto p = repository.save(newProd);
		response.setStatus(200);
		
		if (p == null)
			response.setStatus(404);
		
		return p;
	}
}
