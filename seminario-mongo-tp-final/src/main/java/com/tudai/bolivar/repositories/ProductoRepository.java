package com.tudai.bolivar.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tudai.bolivar.models.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String> {
	
}
