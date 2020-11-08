package com.tudai.bolivar.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
@Document(collection = "ventas")
public class Venta {

	@Id
	private @NonNull String id;
	private @NonNull List<RenglonVenta> productos;
	private @NonNull double precioTotal;
	private @NonNull String direccionEntrega;
	
	public Venta() {
	}
	
	public Venta(String direccionEntrega) {
		super();
		this.productos = new ArrayList<RenglonVenta>();
		this.precioTotal = 0;
		this.direccionEntrega = direccionEntrega;
	}
	
	public Venta(List<RenglonVenta> productos, String direccionEntrega) {
		this.productos = new ArrayList<RenglonVenta>();
		this.precioTotal = 0;
		this.calcularPrecio(productos);
		this.direccionEntrega = direccionEntrega;
	}
	
	private void calcularPrecio(List<RenglonVenta> productos) {
		for (RenglonVenta producto : productos) {
			this.addProducto(producto);
		}
		
	}

	public boolean addProducto(RenglonVenta p) {
		this.precioTotal += p.getTotal();
		return this.productos.add(p);
	}
	
	public void setearPrecios() {
		for (RenglonVenta producto : this.productos) {
			this.precioTotal += producto.getTotal();
		}
	}
	
}