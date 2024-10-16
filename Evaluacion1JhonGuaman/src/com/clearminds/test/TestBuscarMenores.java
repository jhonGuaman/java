package com.clearminds.test;

	import com.clearminds.componentes.Celda;
	import com.clearminds.componentes.Producto;
	import com.clearminds.maquina.MaquinaDulces;

	import java.util.ArrayList;

	public class TestBuscarMenores {

	    public static void main(String[] args) {
	    	
	    	MaquinaDulces maquina=new MaquinaDulces();
			maquina.agregarCelda(new Celda("A"));
			maquina.agregarCelda(new Celda("B"));
			maquina.agregarCelda(new Celda("C"));
			maquina.agregarCelda(new Celda("D"));
			maquina.agregarCelda(new Celda("E"));
			maquina.agregarCelda(new Celda("F"));
			
			Producto producto=new Producto("Papitas",0.85, "KE34");
			maquina.cargarProducto(producto, "A", 4);
			Producto producto1 = new Producto("Gatorade", 0.35,"P84");
			maquina.cargarProducto(producto1, "B", 5);
			Producto producto2=new Producto("Colas",0.5, "KE45");
			maquina.cargarProducto(producto2, "C", 4);
			Producto producto3 = new Producto("Chocolates", 0.40,"P453");
			maquina.cargarProducto(producto3, "D", 5);
			Producto producto4=new Producto("Chicles",0.54, "K546");
			maquina.cargarProducto(producto4, "E", 4);
			Producto producto5 = new Producto("Caramelos", 2.54,"P456");
			maquina.cargarProducto(producto5, "F", 5);

	        double limite = 0.85;
	        
	        
	        ArrayList<Producto> productosMenores = maquina.buscarMenores(limite);

	        System.out.println("Productos Menores: " + productosMenores.size());

	        for (Producto product : productosMenores) {
	            System.out.println("Nombre: " + product.getNombre() + " Precio: " + product.getPrecio());
	        }
	    }
	}

