package com.krakedev;

public class TestCalculadota {

	public static void main(String[] args) {
		Calculadora calcu;
		 int resultadoSuma;
		 int resultadoResta;
		 double resultadoMultiplicación;
		 double resultadoDividir;
		 double resultadoPromediar;
		 
		 calcu=new Calculadora();
		 resultadoSuma=calcu.sumar(5, 3);
		 resultadoResta=calcu.restar(8, 3);
		 resultadoMultiplicación=calcu.multiplicar(6.5, 5.5);
		 resultadoDividir=calcu.dividir(10, 2);
		 resultadoPromediar=calcu.promediar(10, 8, 9);
		 System.out.println("RESULTADO: "+resultadoSuma);
		 System.out.println("RESULTADO: "+resultadoResta);
		 System.out.println("RESULTADO: "+resultadoMultiplicación);
		 System.out.println("RESULTADO: "+resultadoDividir);
		 System.out.println("RESULTADO: "+resultadoPromediar);
		 calcu.mostrarResultado();
	}

}
