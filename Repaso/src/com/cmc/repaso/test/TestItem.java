package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		
		Item item = new Item();
		item.setNombre("cuaderno");
		item.setProductosActuales(20);
		item.imprimir();
		item.vender(5);
		item.devolver(2);
		item.imprimir();
		
		Item item1=new Item();
		System.out.println("*********");
		item1.setNombre("laptop");
		item1.setProductosActuales(10);
		item1.imprimir();
		item1.vender(4);
		item1.devolver(1);
		item1.imprimir();
	}
}
