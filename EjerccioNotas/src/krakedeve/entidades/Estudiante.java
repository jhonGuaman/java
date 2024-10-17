package krakedeve.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	
		
	public Estudiante(String nombre, String apellido, String cedula, ArrayList<Nota> notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas = new ArrayList<>();
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaNota) {
	    for (int i = 0; i < notas.size(); i++) {
	        Nota elementoNota = notas.get(i);
	        if (elementoNota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
	            System.out.println("La materia ya tiene una nota asignada.");
	            return;
	        }
	    }
	    if (nuevaNota.getCalificacion() < 0 || nuevaNota.getCalificacion() > 10) {
	        System.out.println("La calificación debe estar entre 0 y 10.");
	        return;
	    }
	    notas.add(nuevaNota);
	}
	
	public void modificarNota(String codigo, double nuevaCalificacion) {
	    for (int i = 0; i < notas.size(); i++) {
	        Nota elementoNota = notas.get(i);
	        if (elementoNota.getMateria().getCodigo().equals(codigo)) {
	            if (nuevaCalificacion >= 0 && nuevaCalificacion <= 10) {
	                elementoNota.setCalificacion(nuevaCalificacion);
	                System.out.println("Nota actualizada correctamente.");
	            } else {
	                System.out.println("La calificación debe estar entre 0 y 10.");
	            }
	            return;
	        }
	    }
	    System.out.println("No se encontró una nota con el código de materia proporcionado.");
	}

	
	public double calcularPromedioNotasEstudiante() {
	    if (notas.isEmpty()) {
	        return 0;
	    }
	    double suma = 0;
	    for (int i = 0; i < notas.size(); i++) {
	        Nota elementoNota = notas.get(i);
	        suma += elementoNota.getCalificacion();
	    }
	    return suma / notas.size();
	}

	public void mostrar() {
	    System.out.println("Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]");
	    for (int i = 0; i < notas.size(); i++) {
	        Nota elementoNota = notas.get(i);
	        elementoNota.mostrar();
	    }
	}
}
	

