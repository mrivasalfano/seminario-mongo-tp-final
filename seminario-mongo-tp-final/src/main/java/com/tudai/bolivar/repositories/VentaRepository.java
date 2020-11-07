package com.tudai.bolivar.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tudai.bolivar.models.Venta;

public interface VentaRepository extends MongoRepository<Venta, String> {

}
