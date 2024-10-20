package com.krakedev.herencia;

public class Perro  extends Animal{
	
	public Perro() {
		super();
		System.out.println("Ejecuta constructor de Perro"); 
	}
	
	/* en el constructor le ponga o no el super se imprime el contructor del padre
	que es contructor de Animal, asi mismo por defecto se pone
	al poner el costructor se pone el super*/
	
	public void ladar() {
		System.out.println("Pero ladrando");
	}
	
	@Override
	public void dormir() {
		super.dormir(); // llama a dormir de Animal
		System.out.println("Perro durmiendo");
	}

}
