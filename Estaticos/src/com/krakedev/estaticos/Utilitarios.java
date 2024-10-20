package com.krakedev.estaticos;

public class Utilitarios {
	
	public static boolean valirRango(int valor) {  
		if(valor>=0 && valor<=10) {
			return true;
		}else {
			return false;
		}
	}

	/*le ponemos static para que metodo pertenesca 
	 a la clase ya no al objeto
	 */
	// y en el testUtilitarios ya no hace falta crear o instaciar el objeto
}
