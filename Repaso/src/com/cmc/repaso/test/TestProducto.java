package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto =new Producto("mochila",28.50f);
		producto.setPrecio(30);
		double preciof=producto.calculaPrecioPromo(50);
		
		System.out.println("El preciocon el descuento es: "+preciof);	
		}

	}
