package com.tudai.bolivar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tudai.bolivar.models.Producto;
import com.tudai.bolivar.repositories.ProductoRepository;

@SpringBootApplication
public class SeminarioMongoTpFinalApplication implements CommandLineRunner {
	@Autowired
	private ProductoRepository prodRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SeminarioMongoTpFinalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		prodRepository.deleteAll();
		
		prodRepository.save(new Producto("Papa", 10, 30));
		prodRepository.save(new Producto("Cebolla", 5, 15.50));
		prodRepository.save(new Producto("Galletitas Bagley", 15, 89.90));
	}

}
