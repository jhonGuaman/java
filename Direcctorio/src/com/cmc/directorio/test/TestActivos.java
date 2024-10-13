package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;

public class TestActivos {
    public static void main(String[] args) {
    	AdminContactos admin = new AdminContactos();
        
        Telefono t1 = new Telefono("claro", "098765432", 2);        
        Contacto c1 = new Contacto("Carlos", "Santana", t1, 75.0);
       
        System.out.println("Antes de activar:");
        c1.imprimirCotanto();
        
        admin.activarUsuario(c1);
       
        System.out.println("Después de intentar activar:");
        c1.imprimirCotanto();
    }
}
