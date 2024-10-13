package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContato1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("Movi","0989418934",1234);
		Contacto c = new Contacto("Jhon","Guaman",telef,25.5f);
		
		c.imprimirCotanto();
	}
}
