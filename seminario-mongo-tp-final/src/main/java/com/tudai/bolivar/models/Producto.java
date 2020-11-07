package com.tudai.bolivar.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
@Document(collection = "productos")
public class Producto {
	@Id
	private @NonNull String id;
	
	private @NonNull String nombre;
	
	private @NonNull int stock;
	
	private @NonNull double precio;

	public Producto() {
		
	}

	public Producto(String nombre, int stock, double precio) {
		super();
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}

	public Producto(String id, String nombre, int stock, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}
	
}
