package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		AdminTelefono adminTe = new AdminTelefono();
		
		Telefono t1 = new Telefono("movi", "098234567", 1);
        Telefono t2 = new Telefono("claro", "098765432", 2);
        Telefono t3 = new Telefono("movi", "098123456", 3);	
        
        int cantidadMovi=adminTe.contarMovi(t1, t2, t3);
        System.out.println("Cantidad de teléfonos con operadora 'movi': " + cantidadMovi);
	}

}
