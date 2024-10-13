package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensajeria(Telefono telefono) {
		if (telefono.getOperadora().equals("movi")) {
			telefono.setTieneWhatsapp(true);
			
		}
	}
	
	public int contarMovi(Telefono t1,Telefono t2, Telefono t3) {
		int contador=0;
		if (t1.getOperadora().equals("movi")) contador++;
        if (t2.getOperadora().equals("movi")) contador++;
        if (t3.getOperadora().equals("movi")) contador++;
        return contador;
		
	}
	
	public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
        int contador = 0;
        if (t1.getOperadora().equals("claro")) contador++;
        if (t2.getOperadora().equals("claro")) contador++;
        if (t3.getOperadora().equals("claro")) contador++;
        if (t4.getOperadora().equals("claro")) contador++;
        return contador;
    }
}
