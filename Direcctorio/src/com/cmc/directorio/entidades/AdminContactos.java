package com.cmc.directorio.entidades;

public class AdminContactos {

	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		if (c1.getPeso() > c2.getPeso()) {
			return c1;
		} else {
			return c2;
		}
	}

	public boolean compararOperadoras(Contacto c1, Contacto c2) {
	    if (c1.getTelefono().getOperadora().equals(c2.getTelefono().getOperadora())) {
	        return true;
	    } else {
	        return false;
	    }
	}


	public void activarUsuario(Contacto contacto) {
		if (contacto.getTelefono().isTieneWhatsapp()) {
			contacto.setActivo(true);
		}
	}
}