package com.krakedev;

public class Rectangulo {
	
	public int base;
	public int altura;
	
	public int calcularArea() {
		int area=base*altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = ((double)base*2)+((double)altura*2);
		return perimetro;
	}
}
