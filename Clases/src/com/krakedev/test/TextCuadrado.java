package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TextCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c=new Cuadrado();
		 
		double areaCuadrado;
		double perimetroCuadrado;
		
		c.setLado(6);
		areaCuadrado=c.calcularArea();
		perimetroCuadrado=c.calcularPerimetro();
		
		System.out.println("Area: "+areaCuadrado);
		System.out.println("Perimetro: "+perimetroCuadrado);

	}

}
