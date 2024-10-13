package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;

public class TestContactos2 {
    public static void main(String[] args) {
        
        AdminContactos admin = new AdminContactos();
        Telefono t1 = new Telefono("claro", "098234567", 1);
        Telefono t2 = new Telefono("claro", "098765432", 2);
       
        Contacto c1 = new Contacto("Maria", "Moreno", t1, 80.5);
        Contacto c2 = new Contacto("Diana", "Iza", t2, 65.3);

        Contacto masPesado = admin.buscarMasPesado(c1, c2);
        System.out.println("El contacto con mayor peso es:");
        masPesado.imprimirCotanto();

        
        boolean mismaOperadora = admin.compararOperadoras(c1, c2);
        System.out.println("Ambos contactos tienen la misma operadora: " + mismaOperadora);
    }
}