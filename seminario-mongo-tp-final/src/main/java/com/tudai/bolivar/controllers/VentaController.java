package com.tudai.bolivar.controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tudai.bolivar.models.Venta;
import com.tudai.bolivar.repositories.VentaRepository;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	@Autowired
	private VentaRepository repository;
	
	@GetMapping("/")
    public Iterable<Venta> getVentas() {
    	return repository.findAll();
    }
	
	@GetMapping("/{id}")
    public Venta getVenta(@PathVariable String id, HttpServletResponse response) {
    	Optional<Venta> prod = repository.findById(id);
    	
    	if (prod.isPresent()) {
    		response.setStatus(200);
    		return prod.get();
    	}
    	
    	response.setStatus(404);
    	return null;
    }
	
	@PostMapping("/")
	public Venta addVenta(Venta v) {
		return repository.save(v);
	}
}
