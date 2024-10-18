package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula= cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos=new ArrayList<>();
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {
	    for (int i = 0; i < telefonos.size(); i++) {
	        Telefono telefono = telefonos.get(i);
	        if (telefono.getEstado().equals("C")) {
	            System.out.println(telefono.getNumero());
	        }
	    }
	}
	
	public ArrayList<Telefono> recuperarIncorrectos() {
	    ArrayList<Telefono> incorrectos = new ArrayList<>();
	    for (int i = 0; i < telefonos.size(); i++) {
	        Telefono telefono = telefonos.get(i);
	        if (telefono.getEstado().equals("E")) {
	            incorrectos.add(telefono);
	        }
	    }
	    return incorrectos;
	}
	public void imprimir() {
		System.out.println("Cédula: "+this.cedula);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Apellido: "+this.apellido);
		if (direccion != null) {
            System.out.println("Direccion: ");
		System.out.println("         Calle Principal: "+ direccion.getCallePrincipal() );
		System.out.println("         Calle Secundaria: "+ direccion.getCalleSecundaria());
        } else {
            System.out.println("Direccion: No asignada");
        }
    }
	public void imprimir2() {

		System.out.println("***"+this.nombre+" "+this.apellido+"****");
		
		if (direccion != null) {
            System.out.println("Direccion: "+direccion.getCallePrincipal()+" y "+direccion.getCalleSecundaria());
		
        } else {
            System.out.println("No tiene asociada una dirección");
        }
    }
}
	

