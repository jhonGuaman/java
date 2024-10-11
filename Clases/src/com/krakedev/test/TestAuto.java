package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1;
		Auto auto2;
		
		auto1=new Auto("KIA",2010,5500.50F);
		auto2 = new Auto("WOLSWAGEN",2024,2500.50F);
		
		auto1.setMarca("Chevrolet");
		auto1.setAnio(2024);
		auto1.setPrecio(23.500f);
		
		auto2.setMarca("Nissam");
		auto2.setAnio(2023);
		auto2.setPrecio(22.500f);
		
		System.out.println("****Auto 1****");
		System.out.println("Auto 1: "+auto1.getMarca() );
		System.out.println("Auto 1: "+auto1.getAnio());
		System.out.println("Auto 1: "+auto1.getPrecio());
		
		System.out.println("---------------");
		System.out.println("****Auto 2****");
		System.out.println("Auto 2: "+auto2.getMarca());
		System.out.println("Auto 2: "+auto2.getAnio());
		System.out.println("Auto 2: "+auto2.getPrecio());
		
	}

}
