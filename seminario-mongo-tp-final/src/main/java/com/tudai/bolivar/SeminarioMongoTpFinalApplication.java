package com.tudai.bolivar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tudai.bolivar.models.Producto;
import com.tudai.bolivar.models.RenglonVenta;
import com.tudai.bolivar.models.Venta;
import com.tudai.bolivar.repositories.ProductoRepository;
import com.tudai.bolivar.repositories.VentaRepository;

@SpringBootApplication
public class SeminarioMongoTpFinalApplication implements CommandLineRunner {
	@Autowired
	private ProductoRepository prodRepository;

	@Autowired
	private VentaRepository ventaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SeminarioMongoTpFinalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		prodRepository.deleteAll();
		ventaRepository.deleteAll();
		
		Producto p1 = prodRepository.save(new Producto("Papa", 10, 30));
		Producto p2 = prodRepository.save(new Producto("Cebolla", 5, 15.50));
		Producto p3 = prodRepository.save(new Producto("Galletitas Bagley", 15, 89.90));
		
		
		Venta v = new Venta("Av.Belgrano 1001");
		v.addProducto(new RenglonVenta(p1, 5));
		v.addProducto(new RenglonVenta(p2, 5));
		v.addProducto(new RenglonVenta(p3, 5));
		
		ventaRepository.save(v);
	}

}
