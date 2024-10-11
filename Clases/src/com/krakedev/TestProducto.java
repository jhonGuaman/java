package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA = new Producto("Lemonflu","sobre de 50gr",5.98f, 8);
		productoB = new Producto("curita"," cinta transparente",1.50f, 10);
		productoC = new Producto("desodorante","producto en barra de 100gr",3.50f, 7);
		
		productoA.setNombre("alcohol");
		productoA.setDescripcion("botella de 100l");
		productoA.setPrecio(7.50f);
		productoA.setStockActual(10);
		
		productoB.setNombre("finalin");
		productoB.setDescripcion("pastilla de 500gr");
		productoB.setPrecio(2.50f);
		productoB.setStockActual(15);
		
		productoC.setNombre("javon");
		productoC.setDescripcion("barra de 50g");
		productoC.setPrecio(1.50f);
		productoC.setStockActual(20);
		
		System.out.println("---FARMACIA---");
		System.out.println("Nombre producto: "+productoA.getNombre());
		System.out.println("Descripcion: "+productoA.getDescripcion());
		System.out.println("Precio: "+productoA.getPrecio());
		System.out.println("Stock: "+productoA.getStockActual());
		
		System.out.println("--------------------");
		System.out.println("Nombre producto: "+productoB.getNombre());
		System.out.println("Descripcion: "+productoB.getDescripcion());
		System.out.println("Precio: "+productoB.getPrecio());
		System.out.println("Stock: "+productoB.getStockActual());
		
		System.out.println("--------------------");
		System.out.println("Nombre producto: "+productoC.getNombre());
		System.out.println("Descripcion: "+productoC.getDescripcion());
		System.out.println("Precio: "+productoC.getPrecio());
		System.out.println("Stock: "+productoC.getStockActual());
		
	}

}
