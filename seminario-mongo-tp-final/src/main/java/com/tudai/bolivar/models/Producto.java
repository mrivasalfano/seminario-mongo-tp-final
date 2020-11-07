package com.tudai.bolivar.models;

import org.springframework.data.annotation.Id;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter @Setter
//@Document //para definir el nombre de la colección
public class Producto {
	@Id
	private @NonNull int id;
	
	private @NonNull String nombre;
	
	private @NonNull int stock;
	
	private @NonNull double precio;
}
