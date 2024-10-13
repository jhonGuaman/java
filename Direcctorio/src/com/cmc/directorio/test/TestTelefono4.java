package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		AdminTelefono adte =new AdminTelefono();
		Telefono t1 = new Telefono("movi", "098234567", 1);
        Telefono t2 = new Telefono("claro", "098765432", 2);
        Telefono t3 = new Telefono("claro", "098123456", 3);
        Telefono t4 = new Telefono("movi", "098000000", 4);
        
        int contadorClaro=adte.contarClaro(t1, t2, t3, t4);
        System.out.println("Cantidad de telefonos con operadora claro: "+contadorClaro);
	}

}
