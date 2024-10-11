package com.krakedev;

public class Cuadrado {
	 
	private double lado;
	
		
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		double resultado=lado*lado;
		return resultado;
	}

	public double calcularPerimetro() {
		double resultado=lado*4;
		return resultado;
	}
}
