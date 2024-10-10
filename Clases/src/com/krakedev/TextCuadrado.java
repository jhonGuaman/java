package com.krakedev;

public class TextCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c=new Cuadrado();
		 
		double areaCuadrado;
		double perimetroCuadrado;
		
		c.lado=6;
		areaCuadrado=c.calcularArea();
		perimetroCuadrado=c.calcularPerimetro();
		
		System.out.println("Area: "+areaCuadrado);
		System.out.println("Perimetro: "+perimetroCuadrado);

	}

}
