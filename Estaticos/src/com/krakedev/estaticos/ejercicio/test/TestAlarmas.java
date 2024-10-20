package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarma;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

import java.util.ArrayList;

public class TestAlarmas {
	public static void main(String[] args) {
		
		AdminAlarma admin = new AdminAlarma();

	
		admin.agregarAlarma(new Alarma(DiasSemana.LUNES, 5, 45));
		admin.agregarAlarma(new Alarma(DiasSemana.MARTES, 6, 30));
		admin.agregarAlarma(new Alarma(DiasSemana.MIERCOLES, 7, 15));


		ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		for (Alarma alarma : alarmasActuales) {
			System.out.println(alarma); 		}
	}
}
