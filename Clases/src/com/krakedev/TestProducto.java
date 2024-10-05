package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		
		productoA.nombre="alcohol";
		productoA.descripcion="botella de 100l";
		productoA.precio=7.50f;
		productoA.stockActual=10;
		
		productoB.nombre="finalin";
		productoB.descripcion="pastilla de 500gr";
		productoB.precio=2.50f;
		productoB.stockActual=15;
		
		productoC.nombre="javon";
		productoC.descripcion="barra de 50g";
		productoC.precio=1.50f;
		productoC.stockActual=20;
		
		System.out.println("---FARMACIA---");
		System.out.println("Nombre producto: "+productoA.nombre);
		System.out.println("Descripcion: "+productoA.descripcion);
		System.out.println("Precio: "+productoA.precio);
		System.out.println("Stock: "+productoA.stockActual);
		
		System.out.println("--------------------");
		System.out.println("Nombre producto: "+productoB.nombre);
		System.out.println("Descripcion: "+productoB.descripcion);
		System.out.println("Precio: "+productoB.precio);
		System.out.println("Stock: "+productoB.stockActual);
		
		System.out.println("--------------------");
		System.out.println("Nombre producto: "+productoC.nombre);
		System.out.println("Descripcion: "+productoC.descripcion);
		System.out.println("Precio: "+productoC.precio);
		System.out.println("Stock: "+productoC.stockActual);
		
	}

}
