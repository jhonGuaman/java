package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante es = new Estudiante("Jhon");
		
		es.calificar(9);
		
		System.out.println("Resultado: "+es.getResultado());
	
	}
	}
