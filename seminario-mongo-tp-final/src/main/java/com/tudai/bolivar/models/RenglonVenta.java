package com.tudai.bolivar.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class RenglonVenta {

	private Producto producto;
	private int cantidad;
	private double precioUnitario;
	private double total;
	
	public RenglonVenta() {
		super();
	}
	
	public RenglonVenta(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = producto.getPrecio();
		this.total = this.cantidad * this.precioUnitario;
	}
	
	public double getTotal() {
		this.precioUnitario = this.producto.getPrecio();
		this.total = this.cantidad * this.precioUnitario;
		return this.total;
	}
}
